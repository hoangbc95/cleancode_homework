package com.example.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentDto {
    @ApiModelProperty(name = "school year", example = "2021")
    private int year;
}