package com.example.course_management.service;

import com.example.course_management.dto.UserReqDto;
import com.example.course_management.dto.UserResDto;
import com.example.course_management.entity.Student;
import com.example.course_management.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService implements UserService{
    private final ModelMapper modelMapper;
    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        Student student = new Student();
        modelMapper.map(userReqDto, student);
        student.setYear(userReqDto.getStudent().getYear());
        Student saveStudent = studentRepository.save(student);

        return modelMapper.map(saveStudent, UserResDto.class);
    }
}
