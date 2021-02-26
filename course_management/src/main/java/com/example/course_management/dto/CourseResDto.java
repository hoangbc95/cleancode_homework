package com.example.course_management.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseResDto {
    @ApiModelProperty(name = "Course ID", example = "1")
    private Integer id;
    @ApiModelProperty(name = "Course name", example = "Clean Code")
    private String name;
    @ApiModelProperty(name = "location", example = "HN")
    private String location;
    @ApiModelProperty(name = "teacher", example = "Alice")
    private String teacherName;
}
