package com.example.course_management.controller;

import com.example.course_management.dto.CourseDto;
import com.example.course_management.dto.CourseResDto;
import com.example.course_management.service.CourseService;
import com.example.course_management.service.MapperService;
import com.example.course_management.service.SortService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;
    private final SortService sortService;
    private final MapperService<CourseDto, CourseResDto> mapperService;

    @GetMapping("api/v1/courses")
    @ApiOperation("Search courses by name")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Search courses successfully"),
            @ApiResponse(code = 400, message = "Not Found"),
            @ApiResponse(code = 405, message = "Method not allowed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity<List<CourseResDto>> searchCourses(
            @ApiParam(value = "Search courses by name", example = "Clean Code") @RequestParam(required = false, name = "keyword") String keyWord,
            @ApiParam(value = "Sort course by name or opened", example = "name") @RequestParam(required = false, name = "sortBy") String sortBy
    ) {
        List<CourseDto> courses = courseService.findAllCourseByKeywordName(keyWord);

        if (courses.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
        }
        if (sortBy != null) {
            courses = sortService.sort(courses, sortBy);
        }
        List<CourseResDto> response = mapperService.mappingTypeObjectList(courses,
                CourseResDto.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

