package com.example.registration.service;

import com.example.registration.dto.UserReqDto;
import com.example.registration.dto.UserResDto;

public interface UserService {

    public UserResDto saveUser(UserReqDto userReqDto);
}
