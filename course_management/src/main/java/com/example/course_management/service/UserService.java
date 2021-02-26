package com.example.course_management.service;

import com.example.course_management.dto.UserReqDto;
import com.example.course_management.dto.UserResDto;

public interface UserService {

    public UserResDto saveUser(UserReqDto userReqDto);
}
