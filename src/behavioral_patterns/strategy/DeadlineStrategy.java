package behavioral_patterns.strategy;

import app.Assignment;

import java.util.List;

public class DeadlineStrategy implements PrioritizationStrategy {

    @Override
    public List<Assignment> prioritize(List<Assignment> assignments) {
        System.out.println("Prioritizing by deadline");
        return assignments;
    }
}
