package com.example.registration.controller;

import com.example.registration.dto.UserReqDto;
import com.example.registration.dto.UserResDto;
import com.example.registration.error.ErrorCodes;
import com.example.registration.error.ErrorMessage;
import com.example.registration.error.ServiceRuntimeException;
import com.example.registration.factory.UserServiceFactory;
import com.example.registration.service.EmailService;
import com.example.registration.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final EmailService emailService;
    private final UserServiceFactory userServiceFactory;

    @PostMapping("api/v1/users")
    @ApiOperation("Create user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create user successfully"),
            @ApiResponse(code = 400, message = "Invalid request"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto userReqDto) {
        boolean isExistEmail = emailService.checkExistEmail(userReqDto.getEmail());
        if (isExistEmail) {
            throw new ServiceRuntimeException(
                    HttpStatus.BAD_REQUEST,
                    ErrorCodes.USER_E002,
                    ErrorMessage.USER_E002);
        }
        UserService service = userServiceFactory.getUserService(userReqDto.getMode());
        UserResDto userResponse = service.saveUser(userReqDto);

        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

}

