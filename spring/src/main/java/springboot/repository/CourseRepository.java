package springboot.repository;
import org.springframework.data.repository.CrudRepository;
import springboot.models.Course;
import springboot.models.Topic;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>{
    public List<Course> findByTopicId(String topicId);
    public List<Course> findByName(String topicId);
}
