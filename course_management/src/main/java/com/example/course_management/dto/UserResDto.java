package com.example.course_management.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserResDto {
    @ApiModelProperty(name = "name", example = "Nguyen Van A")
    private String name;
    @ApiModelProperty(name = "email", example = "a.nguyen@gmali.com")
    private String email;
}
