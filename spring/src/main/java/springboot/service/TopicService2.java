package springboot.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.models.Topic;
import springboot.repository.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService2 {


    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics =  new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public Topic getTopic(String id) {
        return topicRepository.findOne(id);

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}

