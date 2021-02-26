package com.example.course_management.service;

import com.example.course_management.dto.UserReqDto;
import com.example.course_management.dto.UserResDto;
import com.example.course_management.entity.Teacher;
import com.example.course_management.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TeacherService implements UserService {
    private final ModelMapper modelMapper;
    private final TeacherRepository teacherRepository;

    @Override
    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        Teacher teacher = new Teacher();
        modelMapper.map(userReqDto, teacher);
        teacher.setExperiences(userReqDto.getTeacher().getExperiences());
        teacher.setPhone(userReqDto.getTeacher().getPhone());
        Teacher saveTeacher = teacherRepository.save(teacher);

        return modelMapper.map(saveTeacher, UserResDto.class);
    }
}

