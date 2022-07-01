package main.java.nl.tilburg;

import main.java.nl.tilburg.jenkins.Greeting;

public class StartApplication {
    public static void main(String[] args) {
        Greeting greeting = new Greeting("First timer", "TestApp 2000");
        System.out.println(greeting);
    }
}
