package com.ochwada.learnify.course.model;


import jakarta.persistence.*;
import lombok.*;


/**
 * *******************************************************
 * Package: com.ochwada.learnify.course.model
 * File: Course.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 3:43 PM
 * Description:The {@code Course} class represents a course entity in the Learnify system.
 * *******************************************************
 */

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    /** Auto-generated primary key ID for internal DB use */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Display name (e.g., "Intro to GeoAI") */
    @Column(nullable = false)
    private String title;

    /** Short course description to inform users of its content */
    private String description;
}
