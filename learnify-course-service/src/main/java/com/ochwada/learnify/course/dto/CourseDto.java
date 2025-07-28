package com.ochwada.learnify.course.dto;


import jakarta.persistence.Column;
import lombok.Data;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.course.dto
 * File: CourseDto.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 4:02 PM
 * Description:  Data Transfer Object (DTO) for transferring course data between layers (e.g., Controller <-> Service).
 * *******************************************************
 */

@Data // Lombok: Generates getters, setters, toString(), equals(), and hashCode()
public class CourseDto {
    /** Display name  */
    private String title;

    /** Short course description to inform users of its content */
    private String description;
}
