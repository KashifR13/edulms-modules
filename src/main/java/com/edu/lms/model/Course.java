package com.edu.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {


    @Id
    private Long courseCode;

    private String courseName;

    private String languageOfLearning;

    private String gradingScale;

    private String courseLevel;

    private boolean hasPrerequisite;

}
