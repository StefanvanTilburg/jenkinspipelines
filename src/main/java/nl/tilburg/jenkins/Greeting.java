package main.java.nl.tilburg.jenkins;

public class Greeting {
    private String greeting;
    private String internal;

    public Greeting(String greeting, String internal) {
        this.greeting = greeting;
        this.internal = internal;
    }

    @Override
    public String toString() {
        return String.format("Greetings there %s! This is a hello from %s.", greeting, internal);
    }
}
