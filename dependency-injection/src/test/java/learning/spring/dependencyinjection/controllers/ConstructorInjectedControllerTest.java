package learning.spring.dependencyinjection.controllers;

import learning.spring.dependencyinjection.controller.ConstructorInjectedController;
import learning.spring.dependencyinjection.controller.SetterInjectedController;
import learning.spring.dependencyinjection.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;
    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
