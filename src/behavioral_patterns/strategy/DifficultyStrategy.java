package behavioral_patterns.strategy;

import app.Assignment;

import java.util.List;

public class DifficultyStrategy implements PrioritizationStrategy {
    @Override
    public List<Assignment> prioritize(List<Assignment> assignments) {
        System.out.println("Prioritizing by difficulty");
        return assignments;
    }
}
