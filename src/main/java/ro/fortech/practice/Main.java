package ro.fortech.practice;

import ro.fortech.practice.clock.Clock;
import ro.fortech.practice.clock.InternalClockUsingCalendar;

public class Main {

    public static void main(String[] args) {
        Clock clock = new InternalClockUsingCalendar();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);
        String message = generator.generateGreetingMessage("Buggs Bunny");
        System.out.println(message);
    }
}