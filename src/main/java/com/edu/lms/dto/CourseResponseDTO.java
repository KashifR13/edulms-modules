package com.edu.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponseDTO {

    private Long courseCode;
    private String courseName;
    private String languageOfLearning;
    private String gradingScale;
    private String courseLevel;
    private boolean hasPrerequisite;

}
