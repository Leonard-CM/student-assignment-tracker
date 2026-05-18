package com.app.behavioral_patterns.strategy;

import com.app.model.Assignment;
import java.util.List;

public interface PrioritizationStrategy {
    List<Assignment> prioritize(List<Assignment> assignments);
}