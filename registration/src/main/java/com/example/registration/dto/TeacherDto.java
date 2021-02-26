package com.example.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherDto {
    @ApiModelProperty(name = "teacher phone number", example = "0987654321")
    private String phone;
    @ApiModelProperty(name = "experiences", example = "1")
    private int experiences;
}
