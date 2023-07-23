package com.edu.lms.service;

import com.edu.lms.dto.CourseRequestDTO;
import com.edu.lms.dto.CourseResponseDTO;
import com.edu.lms.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICourseService {

    void createNewCourse(CourseRequestDTO courseRequestDTO);
    List<CourseResponseDTO> getAllCourses();
    CourseResponseDTO mapToCourseResponse(Course course);
    Optional<Course> getCourseByCourseCode(Long courseCode);
}
