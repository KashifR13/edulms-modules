package com.edu.lms.service;

import com.edu.lms.dto.CourseResponseDTO;
import com.edu.lms.model.Course;
import com.edu.lms.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseResponseDTO> getAllCourses() {
        List<Course> courses = courseRepository.findAll();

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
}
