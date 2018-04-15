package springboot.repository;
import org.springframework.data.repository.CrudRepository;
import springboot.models.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{
    // getAllTopics()
    // getTopic()
    // updateTopic()
    // deleteTopic()
}
