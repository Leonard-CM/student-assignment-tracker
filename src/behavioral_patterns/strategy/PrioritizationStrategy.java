package behavioral_patterns.strategy;

import app.Assignment;
import java.util.List;

public interface PrioritizationStrategy {
    List<Assignment> prioritize(List<Assignment> assignments);
}