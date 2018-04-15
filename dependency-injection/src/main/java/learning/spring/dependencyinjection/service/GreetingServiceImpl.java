package learning.spring.dependencyinjection.service;

public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "HELLO!";

    public String sayGreeting() {
        System.out.println(HELLO);
        return HELLO;
    }
}
