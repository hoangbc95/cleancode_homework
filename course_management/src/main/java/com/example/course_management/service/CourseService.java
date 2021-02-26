package com.example.course_management.service;

import com.example.course_management.dto.CourseDto;
import com.example.course_management.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    @Transactional(readOnly = true)
    @Cacheable(value = "courses", key = "#keyword", condition = "#keyword != null")
    public List<CourseDto> findAllCourseByKeywordName(String keyword) {
        Optional<String> nameOption = Optional.ofNullable(keyword);
        keyword = nameOption.isPresent() ? nameOption.get() : "";
        List<CourseDto> courses = courseRepository.findAllByNameContaining(keyword);
        return courses;
    }
}

