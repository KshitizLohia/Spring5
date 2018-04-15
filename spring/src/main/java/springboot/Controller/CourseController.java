package springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.models.Course;
import springboot.models.Topic;
import springboot.service.CourseService;


import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;
    

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable("id") String id){
        return courseService.getAllCourses();
    }

    @RequestMapping("/topics/{id}/courses/{courseId}")
    public Course getCourse(@PathVariable("id") String id, @PathVariable("courseId") String courseId){
        return courseService.getCourse(courseId);
    }

    @RequestMapping(value = "/topics/{id}/courses", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable("id") String id){
        course.setTopic(new Topic(id,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(value = "/topics/{id}/courses/{courseId}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable("id") String id,
                             @PathVariable("courseId") String courseId){
        course.setTopic(new Topic(id,"",""));
        courseService.updateCourse(course);
    }


    @RequestMapping(value = "/topics/{id}/courses/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") String id, @PathVariable("courseId") String courseId){
        courseService.deleteCourse(courseId);
    }
}
