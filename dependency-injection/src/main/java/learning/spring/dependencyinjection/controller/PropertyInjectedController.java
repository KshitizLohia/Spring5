package learning.spring.dependencyinjection.controller;

import learning.spring.dependencyinjection.service.GreetingService;
import learning.spring.dependencyinjection.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImp;

    public String sayHello(){
        return greetingServiceImp.sayGreeting();
    }
}
