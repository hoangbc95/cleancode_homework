package com.example.course_management.factory;

import com.example.course_management.enums.UserMode;
import com.example.course_management.service.StudentService;
import com.example.course_management.service.TeacherService;
import com.example.course_management.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserServiceFactory {
    private final StudentService studentService;
    private final TeacherService teacherService;

    public UserService getUserService(UserMode mode) {
        if (UserMode.STUDENT.equals(mode)) {
            return studentService;
        } else if (UserMode.TEACHER.equals(mode)) {
            return teacherService;
        }
        return null;
//        } else {
//            throw new ServiceRuntimeException(
//                    HttpStatus.BAD_REQUEST,
//                    ErrorCode.USER_E006,
//                    String.format(ErrorMessage.USER_E006 + ", mode: #%s", mode)
//            );
//        }
    }
}

