package com.example.springmvc.core.controller.test.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TestRequestDto {


    @NotNull
    String name;
}
