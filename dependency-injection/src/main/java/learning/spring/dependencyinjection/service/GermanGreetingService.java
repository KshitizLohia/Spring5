package learning.spring.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ge")
@Primary
@Service
public class GermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "German";
    }
}
