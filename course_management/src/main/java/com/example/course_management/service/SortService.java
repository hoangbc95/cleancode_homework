package com.example.course_management.service;

import com.example.course_management.dto.CourseDto;
import com.example.course_management.error.ErrorMessage;
import com.example.course_management.service.strategies.SortByName;
import com.example.course_management.service.strategies.SortByOpened;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SortService {
    private static Map<String, SortingStrategy> strategies;

    static {
        strategies = new HashMap<>();
        strategies.put("name", new SortByName());
        strategies.put("opened", new SortByOpened());
    }

    public List<CourseDto> sort(List<CourseDto> courses, String sortBy) {
        SortingStrategy sortingStrategy = lookupSortingStrategy(sortBy);

        return sortingStrategy.sort(courses);
    }

    private SortingStrategy lookupSortingStrategy(String strategyName) {
        SortingStrategy sortingStrategy = strategies.get(strategyName);
        if (sortingStrategy == null) {
            throw new UnsupportedOperationException(ErrorMessage.COURSE_E001);
        }
        return sortingStrategy;
    }
}
