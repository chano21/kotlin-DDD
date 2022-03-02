package kr.pco.kotlintoy.core

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


data class PCORes(val code: HttpStatus, val data:Any)
