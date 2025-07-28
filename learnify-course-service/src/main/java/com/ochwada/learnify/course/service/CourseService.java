package com.ochwada.learnify.course.service;


import com.ochwada.learnify.course.dto.CourseDto;
import com.ochwada.learnify.course.mapper.CourseMapper;
import com.ochwada.learnify.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.course.service
 * File: CourseService.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 4:08 PM
 * Description: {@code CourseService } class to handle business logic for retrieving and saving courses
 * *******************************************************
 */
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;

    /**
     * Retrieves all courses from the database.
     *
     * @return A list of CoursesDto objects.
     */
    public List<CourseDto> getAllCourses(){
        return  repository.findAll().stream()
                .map(CourseMapper::toDto).collect(Collectors.toList());
    }
}
