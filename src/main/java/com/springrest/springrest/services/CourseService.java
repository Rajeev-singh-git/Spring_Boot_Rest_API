package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public Course addCourse(Course course);
    public void  deleteCourse(Long courseId);

    public Course updateCourse(Course course);

}
