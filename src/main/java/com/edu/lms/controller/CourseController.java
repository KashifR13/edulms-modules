package com.edu.lms.controller;

import com.edu.lms.dto.CourseResponseDTO;
import com.edu.lms.model.Course;
import com.edu.lms.service.ICourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
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

    /**
     * KMDEV-11
     * An API for getting the course by the given course code.
     * @return course
     */
    @GetMapping("{courseCode}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Course> getCourseByCourseCode(@PathVariable Long courseCode) {
        return courseService.getCourseByCourseCode(courseCode);
    }
}
