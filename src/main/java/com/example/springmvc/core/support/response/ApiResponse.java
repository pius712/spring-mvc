package com.example.springmvc.core.support.response;

import com.example.springmvc.core.support.error.ErrorInfo;
import com.example.springmvc.core.support.error.ExceptionType;

public record ApiResponse<T>(ResultType result, T data, ErrorInfo error) {

    public static ApiResponse<Void> ok() {
        return new ApiResponse<>(ResultType.SUCCESS, null, null);
    }

    public static <S> ApiResponse<S> ok(S result) {
        return new ApiResponse<>(ResultType.SUCCESS, result, null);
    }


    public static ApiResponse<Void> fail(ExceptionType exceptionType) {
        return new ApiResponse<>(ResultType.FAIL, null, new ErrorInfo(exceptionType));
    }
}
