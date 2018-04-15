package learning.spring.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class SpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Spanio";
    }
}
