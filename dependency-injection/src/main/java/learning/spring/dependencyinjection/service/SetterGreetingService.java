package learning.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Injected by setter service";
    }
}
