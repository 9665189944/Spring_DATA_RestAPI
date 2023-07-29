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

    @GetMapping("/coursesbybatchcode/{batchCode}")
    public Course findByBatchCod(@PathVariable String batchCode){
        return service.findByBatchCod(batchCode);
    }
    @GetMapping("/coursebysubject/{subject}")
    List<Course> findBySubject(@PathVariable String subject){
        return service.findBySubject(subject);
    }
    @GetMapping("/course1")
    Course findByBatchCodeAndSubject(@RequestParam(name = "code") String batchCode, @RequestParam(name = "sub") String subject){
        return service.findByBatchCodAndSubject(batchCode,subject);
    }
    @GetMapping("/course2")
    List<Course> findByTotalStudentBetween(@RequestParam(name = "no1") int start,@RequestParam(name = "no2") int end){
        return service.findByTotalStudentBetween(start, end);
    }
    @GetMapping("/course3")
    List<Course> findByBatchCodeOrSubject(@RequestParam(name = "code") String batchCode, @RequestParam(name = "sub") String subject) {
        return service.findByBatchCodeOrSubject(batchCode, subject);
    }
}
