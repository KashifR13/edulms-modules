package com.edu.lms.controller;

import com.edu.lms.dto.CourseResponseDTO;
import com.edu.lms.service.ICourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final ICourseService courseService;

    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * KMDEV-11
     * An API for getting the complete list of courses.
     * @return all the courses
     */
    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseResponseDTO> getAllCourses() {
        return courseService.getAllCourses();
    }
}
