package learning.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "HELLO!";

    public String sayGreeting() {
        System.out.println(HELLO);
        return HELLO;
    }
}
