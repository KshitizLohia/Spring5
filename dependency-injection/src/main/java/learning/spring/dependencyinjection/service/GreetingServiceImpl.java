package learning.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "HELLO! - Orginal";

    public String sayGreeting() {
        return HELLO;
    }
}
