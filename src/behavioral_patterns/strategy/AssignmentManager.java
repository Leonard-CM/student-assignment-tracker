package behavioral_patterns.strategy;

import app.Assignment;

import java.util.List;

public class AssignmentManager {

    private PrioritizationStrategy strategy;

    public void setStrategy(PrioritizationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Assignment> prioritize(List<Assignment> assignments) {
        return strategy.prioritize(assignments);
    }
}
