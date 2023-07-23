package com.edu.lms.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

import java.io.Serial;

public class CourseException extends ResponseStatusException {

    @Serial
    private static final long serialVersionUID = 1L;

    public CourseException(HttpStatusCode status, String reason) {
        super(status, reason);
    }

}
