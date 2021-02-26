package com.example.course_management.service;

import com.example.course_management.dto.CourseDto;

import java.util.List;

public interface SortingStrategy {
    public List<CourseDto> sort(List<CourseDto> courses);
}