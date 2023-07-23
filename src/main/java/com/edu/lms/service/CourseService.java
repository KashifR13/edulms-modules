package com.edu.lms.service;

import com.edu.lms.dto.CourseResponseDTO;
import com.edu.lms.exception.CourseException;
import com.edu.lms.model.Course;
import com.edu.lms.repository.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseResponseDTO> getAllCourses() {
        List<Course> courses = courseRepository.findAll();

        if (courses.isEmpty()) {
            throw new CourseException(HttpStatus.NOT_FOUND, "No course found.");
        }
        return courses.stream().map(this::mapToCourseResponse).toList();
    }

    @Override
    public CourseResponseDTO mapToCourseResponse(Course course) {
        return CourseResponseDTO.
                builder().
                courseCode(course.getCourseCode()).
                courseName(course.getCourseName()).
                languageOfLearning(course.getLanguageOfLearning()).
                gradingScale(course.getGradingScale()).
                courseLevel(course.getCourseLevel()).
                hasPrerequisite(course.isHasPrerequisite()).
                build();
    }

    @Override
    public Optional<Course> getCourseByCourseCode(@PathVariable Long courseCode) {
        Optional<Course> course = courseRepository.findById(courseCode);

        if (course.isEmpty()) {
            throw new CourseException(HttpStatus.NOT_FOUND, "No course found. Invalid course code: " + courseCode);
        }
        return course;
    }
}
