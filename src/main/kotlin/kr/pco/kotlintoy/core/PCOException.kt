package kr.pco.kotlintoy.core

import org.springframework.web.bind.annotation.RestControllerAdvice


class PCOException(responseCode: ResponseCode) : RuntimeException() {
    val responseCode: ResponseCode = responseCode
}
