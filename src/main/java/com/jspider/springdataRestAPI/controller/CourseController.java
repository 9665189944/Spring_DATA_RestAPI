package com.jspider.springdataRestAPI.controller;

import com.jspider.springdataRestAPI.model.Course;
import com.jspider.springdataRestAPI.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping("/courses")
    public List<Course> getCourse()
    {
     return    service.getCourse();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable int id)
    {
        return  service.getCourseById(id);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course s)
    {
        service.addCourse(s);
    }

    @PutMapping("/courses")
    public void updateCourse(@RequestBody Course c)
    {
        service.updateCourse(c);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable int id)
    {
        service.deleteCourse(id);
    }


}
