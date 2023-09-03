package com.example.springmvc.core.controller.advice;

import com.example.springmvc.core.support.error.TypeException;
import com.example.springmvc.core.support.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CoreApiAdvice {

    @ExceptionHandler(TypeException.class)
    ResponseEntity<ApiResponse<Void>> typeException(TypeException e) {

        return new ResponseEntity<>(
                ApiResponse.fail(e.exceptionType),
                e.exceptionType.getHttpStatus()
        );
    }
}
