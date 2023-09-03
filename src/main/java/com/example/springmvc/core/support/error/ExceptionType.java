package com.example.springmvc.core.support.error;

import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

public interface ExceptionType {
    HttpStatus getHttpStatus();

    ErrorCode getErrorCode();

    String getErrorMessage();

    LogLevel getLogLevel();
//    HttpStatus status;
//    ErrorCode errorCode;
//    String errorMessage;
//    LogLevel logLevel;
}
