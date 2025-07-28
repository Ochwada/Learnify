package com.ochwada.learnify.course.mapper;


import com.ochwada.learnify.course.dto.CourseDto;
import com.ochwada.learnify.course.model.Course;

/**
 * *******************************************************
 *  Package: com.ochwada.learnify.course.mapper
 *  File: CourseMapper.java
 *  Author: Ochwada
 *  Date: Monday, 28.Jul.2025, 5:34 PM
 *  Description: 
 *  Objective: 
 * *******************************************************
 */
 
 
 public class CourseMapper {
  public static CourseDto toDto(Course course){
   CourseDto dto = new CourseDto();

   dto.setTitle(course.getTitle());
   dto.setDescription(course.getDescription());

   return  dto;
  }
}
