package com.jspider.springdataRestAPI.service;

import com.jspider.springdataRestAPI.model.Course;
import com.jspider.springdataRestAPI.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
            private  CourseRepository repository;

    public List<Course> getCourse()
    {
        List<Course> courses=repository.findAll();
        return courses;
    }

    public  Course getCourseById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    public void addCourse(Course c)
    {
       repository.save(c);
    }

    public void updateCourse(Course c)
    {
        repository.save(c);
    }
    public void deleteCourse(int id)
    {
        repository.deleteById(id);
    }

}
