package learning.spring.dependencyinjection.controller;

import learning.spring.dependencyinjection.service.GreetingService;
import learning.spring.dependencyinjection.service.GreetingServiceImpl;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
