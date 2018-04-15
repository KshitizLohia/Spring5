package springboot.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
public class Course {

    @Id
    String id;
    String name;
    String description;

    @ManyToOne
    Topic topic;

    public Course(){

    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic =  new Topic(topicId, "", "");

    }

}
