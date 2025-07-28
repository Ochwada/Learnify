package com.ochwada.learnify.course.controller;


import com.ochwada.learnify.course.dto.CourseDto;
import com.ochwada.learnify.course.service.CourseService;
import lombok.*;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.course.controller
 * File: CourseController.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 5:27 PM
 * Description:
 * Objective:
 * *******************************************************
 */

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @GetMapping
    public List<CourseDto> getAllCourses(){
       return service.getAllCourses();
    }
}
