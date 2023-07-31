package com.jspider.springdataRestAPI.service;

import com.jspider.springdataRestAPI.model.Course;
import com.jspider.springdataRestAPI.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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

    public Course findByBatchCod(String batchCode){
        return repository.findByBatchCode(batchCode);
    }
    public List<Course> findBySubject(String subject){
        return repository.findBySubject(subject);
    }
    public Course findByBatchCodAndSubject(String batchCode, String subject){
        return repository.findByBatchCodeAndSubject(batchCode,subject);
    }
    public List<Course> findByTotalStudentBetween(int start, int end){
        return repository.findByTotalStudentBetween(start, end);
    }
    public List<Course> findByBatchCodeOrSubject(String batchCode, String subject){
        return repository.findByBatchCodeOrSubject(batchCode, subject);
    }

    //JPQl :- JAVA Persistence Query Language

   public List<Course> findCourse()
   {
       return repository.findCourse();
   }

   public  List<Course> displayCourseBySubject(String subject)
   {
       return  repository.displayCourse(subject);
   }

   public List<Course> displayCourseContainsA()
   {
       return repository.displayCourseContainsA();
   }

    public List<Course> displayCourseBybatchcode(String Char)
    {
        return repository.displayCourseBybatchcode(Char);
    }
}
