package com.example.springmvc.core.support.error;

import lombok.Getter;
import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

@Getter
public enum GlobalExceptionType implements ExceptionType {

    BAD_REQUEST(HttpStatus.BAD_REQUEST, ErrorCode.BAD_REQUEST, "잘못된 요청입니다", LogLevel.INFO),
    UNHANDLED_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, ErrorCode.INTERNAL_SERVER_ERROR, "요청 처리 중 오류가 발생하였습니다.", LogLevel.ERROR),
    HANDLER_NOT_FOUND(HttpStatus.BAD_REQUEST, ErrorCode.HANDLER_NOT_FOUND, "요청을 처리할 수 없습니다.", LogLevel.INFO);
    private final HttpStatus httpStatus;
    private final ErrorCode errorCode;
    private final String errorMessage;
    private final LogLevel logLevel;

    GlobalExceptionType(HttpStatus httpStatus, ErrorCode errorCode, String errorMessage, LogLevel logLevel) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.logLevel = logLevel;
    }
}
