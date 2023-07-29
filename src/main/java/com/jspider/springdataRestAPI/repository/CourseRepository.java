package com.jspider.springdataRestAPI.repository;

import com.jspider.springdataRestAPI.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {


}
