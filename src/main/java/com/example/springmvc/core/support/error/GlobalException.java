package com.example.springmvc.core.support.error;

public class GlobalException extends TypeException {
    public GlobalException(ExceptionType exceptionType) {
        super(exceptionType);
    }
}
