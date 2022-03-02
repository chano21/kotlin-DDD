package kr.pco.kotlintoy.spring

import kr.pco.kotlintoy.core.ResponseCode
import kr.pco.kotlintoy.core.PCOException
import kr.pco.kotlintoy.core.PCORes
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
final class ExceptionAdviser {
    private lateinit var status:HttpStatus
    private lateinit var fileds:List<String?> // list론오지만 string은 null일수있음.

    @ExceptionHandler(PCOException::class)
    fun pcoExceptionHandler(e:PCOException):ResponseEntity<PCORes>{
        status=  e.responseCode.status
        return ResponseEntity.status(e.responseCode.status).
        body(PCORes(status,e.responseCode.message))
    }

    @ExceptionHandler(PCOException::class)
    fun serverErrorExceptionHandler(e: Exception):ResponseEntity<PCORes>{
        status=HttpStatus.INTERNAL_SERVER_ERROR
        return ResponseEntity.status(status)
            .body(PCORes(status,ResponseCode.SERVER_ERROR.message))
    }


    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun invalidParameterExceptionHandler(e: MethodArgumentNotValidException):ResponseEntity<PCORes>{
        fileds=e.bindingResult.fieldErrors.map{f -> f.defaultMessage }.toList()
        status=HttpStatus.BAD_REQUEST
        return ResponseEntity.status(status)
            .body(PCORes(status,fileds))
    }



}
