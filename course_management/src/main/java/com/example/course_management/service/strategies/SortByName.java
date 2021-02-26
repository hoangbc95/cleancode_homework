package com.example.course_management.service.strategies;

import com.example.course_management.dto.CourseDto;
import com.example.course_management.service.SortingStrategy;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SortByName implements SortingStrategy {
    @Override
    public List<CourseDto> sort(List<CourseDto> courses) {
        return courses.stream()
                .sorted(Comparator.comparing(CourseDto::getName))
                .collect(Collectors.toList());
    }

}
