package com.jspider.springdataRestAPI.repository;

import com.jspider.springdataRestAPI.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

    //find course base on batch code
    Course findByBatchCode(String batchCode);

    //find course detail base on subject
    List<Course> findBySubject(String subject);

    //find course detail having specific batch code and subject
    Course findByBatchCodeAndSubject(String batchCode, String subject);

    //find course detail having total student between ? and ?
    List<Course> findByTotalStudentBetween(int start, int end);

    //find course detail having specific batch code or subject
    List<Course> findByBatchCodeOrSubject(String batchCode, String subject);

}

