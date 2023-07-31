package com.jspider.springdataRestAPI.repository;

import com.jspider.springdataRestAPI.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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


//JPQL Java Persistence query Language
    @Query("select c from Course c")
    List<Course> findCourse();

    @Query("select c.batchCode from Course c")
    List<String> getAllBatchCode();

    @Query("select c from Course c where c.subject=:subject")
    List<Course> displayCourse(@Param("subject") String subject);

    @Query("select c from Course c where c.subject like '%A%'")
    List<Course> displayCourseContainsA();

    //batchCode Contains specified character ( value from end user)
    @Query("select c from Course c where c.batchCode like %:Char%")
    List<Course>  displayCourseBybatchcode(@Param("Char") String Char);
}

