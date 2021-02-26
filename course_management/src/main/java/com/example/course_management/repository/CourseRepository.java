package com.example.course_management.repository;

import com.example.course_management.dto.CourseDto;
import com.example.course_management.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<CourseDto> findAllByNameContaining(String name);
}

