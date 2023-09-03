package com.example.springmvc.core.controller.test;

import com.example.springmvc.core.controller.test.request.TestRequestDto;
import com.example.springmvc.core.support.error.CoreException;
import com.example.springmvc.core.support.error.CoreExceptionType;
import com.example.springmvc.core.support.error.TypeException;
import com.example.springmvc.core.support.response.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("validation")
public class ValidationController {


    @PostMapping("test")
    public void test(
            @RequestBody @Valid TestRequestDto testRequestDto
    ) {
        throw new CoreException(CoreExceptionType.NOT_FOUND);
    }

    @GetMapping("advice")
    public void testAdvice() {
        throw new CoreException(CoreExceptionType.NOT_FOUND);
    }

    @GetMapping("advice2")
    public ResponseEntity<Object> testAdvice2() {
        TypeException ex = new CoreException(CoreExceptionType.NOT_FOUND);
        return new ResponseEntity<>(
                ApiResponse.fail(ex.exceptionType),
                ex.exceptionType.getHttpStatus()
        );
    }

    @GetMapping("test")
    public String test(
    ) {
        return "hello";
    }
}
