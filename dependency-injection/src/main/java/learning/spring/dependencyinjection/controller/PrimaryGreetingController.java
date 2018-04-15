package learning.spring.dependencyinjection.controller;

import learning.spring.dependencyinjection.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryGreetingController {

    private GreetingService greetingService;

    public PrimaryGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
