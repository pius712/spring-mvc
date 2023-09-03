package com.example.springmvc.core.support.error;


public class CoreException extends TypeException {
    public CoreException(ExceptionType exceptionType) {
        super(exceptionType);
    }
}
