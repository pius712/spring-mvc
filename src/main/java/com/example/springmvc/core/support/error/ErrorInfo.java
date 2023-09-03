package com.example.springmvc.core.support.error;

import lombok.Getter;

@Getter
public class ErrorInfo {
    private final String code;
    private final String message;

    public ErrorInfo(ExceptionType exceptionType) {
        this.code = exceptionType.getErrorCode().name();
        this.message = exceptionType.getErrorMessage();
    }
}
