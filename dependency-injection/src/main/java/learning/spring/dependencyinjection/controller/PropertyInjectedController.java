package learning.spring.dependencyinjection.controller;

import learning.spring.dependencyinjection.service.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public GreetingServiceImpl getGreetingService(){
        return greetingService;
    }


}
