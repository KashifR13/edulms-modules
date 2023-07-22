package com.edu.lms.service;

import com.edu.lms.dto.CourseResponseDTO;
import com.edu.lms.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICourseService {

    List<CourseResponseDTO> getAllCourses();
    CourseResponseDTO mapToCourseResponse(Course course);
}
