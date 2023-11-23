package ro.fortech.practice;

import ro.fortech.practice.clock.Clock;

public class GreetingMessageGenerator {
    private final Clock clock;

    public GreetingMessageGenerator(Clock clock) {
        this.clock = clock;
    }

    public String generateGreetingMessage(String personName) {
        return "Good " + getMomentOfDay() + ", " + personName + "!";
    }

    private String getMomentOfDay() {
        int hourOfDay = clock.getHourOfDay();
        if ((5 <= hourOfDay) && (hourOfDay < 12)) {
            return "morning";
        }
        if ((12 <= hourOfDay) && (hourOfDay < 18)) {
            return "afternoon";
        }
        if ((18 <= hourOfDay) && (hourOfDay < 22)) {
            return "evening";
        }
        return "night";
    }
}