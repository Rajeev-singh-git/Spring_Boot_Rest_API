package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl  implements CourseService{

    @Autowired
    private CourseDao courseDao;
 //   List<Course> list;

    public CourseServiceImpl(){
 //       list = new ArrayList<>();
 //       list.add(new Course(145L, "Java course", "this course contains complete java tutorial"));
 //       list.add(new Course(146L,"Spring Boot","Make app using spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        //return list;
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
//        System.out.println("courseId "+ courseId);
//        Course c = null;
//        for(Course cse: list){
//            if(cse.getId().equals(courseId)){
//                c=cse;
//                break;
//            }
//        }
//
//        return c;
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        courseDao.save(course);
        return course;
    }


    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e -> {
//          if(e.getId() == course.getId()){
//              e.setTitle(course.getTitle());
//              e.setDescription(course.getDescription());
//          }
//        });
//        return course;
         courseDao.save(course);
         return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
//       list = list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
         Course entity = courseDao.getOne(courseId);
         courseDao.delete(entity);
    }

}
