package com.example.springmvc.core.support.error;

import lombok.Getter;
import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

@Getter()
public enum CoreExceptionType implements ExceptionType {

    NOT_FOUND(HttpStatus.NOT_FOUND, ErrorCode.TEST, "에러 발생", LogLevel.WARN);

    CoreExceptionType(HttpStatus httpStatus, ErrorCode errorCode, String errorMessage, LogLevel logLevel) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.logLevel = logLevel;
    }

    private final HttpStatus httpStatus;
    private final ErrorCode errorCode;
    private final String errorMessage;
    private final LogLevel logLevel;

}
