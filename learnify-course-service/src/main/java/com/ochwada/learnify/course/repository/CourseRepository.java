package com.ochwada.learnify.course.repository;


import com.ochwada.learnify.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.course.repository
 * File: CourseRepository.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 4:05 PM
 * Description: Repository interface for managing {@link Course} entities. Provides CRUD operations and query support
 * via Spring Data JPA.
 * *******************************************************
 */


public interface CourseRepository extends JpaRepository<Course, Long> {
    /**
     *  Extends {@link JpaRepository}, allowing standard CRUD operations without implementing any methods.
     */
}
