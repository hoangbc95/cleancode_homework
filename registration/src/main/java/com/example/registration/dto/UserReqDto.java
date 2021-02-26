package com.example.registration.dto;

import javax.validation.constraints.NotEmpty;

import com.example.registration.enums.UserMode;
import com.example.registration.error.ErrorMessage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserReqDto {
    @NotEmpty(message = ErrorMessage.USER_E001)
    @ApiModelProperty(value = "user name", example = "Nguyen Van A", required = true)
    private String name;

    @NotEmpty(message = ErrorMessage.USER_E001)
    @ApiModelProperty(value = "email", example = "a.nguyen@gmali.com", required = true)
    private String email;

    @NotEmpty(message = ErrorMessage.USER_E001)
    @ApiModelProperty(value = "password", example = "123456", required = true)
    private String password;

    @ApiModelProperty(name = "student")
    private StudentDto student;

    @ApiModelProperty(name = "teacher", hidden = true)
    private TeacherDto teacher;

    @NotEmpty(message = ErrorMessage.USER_E001)
    @ApiModelProperty(name = "mode user", example = "STUDENT", required = true)
    private UserMode mode;
}

