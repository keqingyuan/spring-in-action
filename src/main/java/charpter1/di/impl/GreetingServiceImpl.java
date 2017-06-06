package charpter1.di.impl;

import charpter1.di.GreetingService;

/**
 * Created by qingyuan on 6/5/17.
 */
public class GreetingServiceImpl implements GreetingService {
    private String greeting;

    public GreetingServiceImpl() {
    }

    public GreetingServiceImpl(String greeting) {
        this.greeting = greeting;
    }

    public void sayHi() {
        System.out.println(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
