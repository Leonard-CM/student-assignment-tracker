package com.app.behavioral_patterns.strategy;

import com.app.model.Assignment;

import java.util.List;

public class DifficultyStrategy implements PrioritizationStrategy {
    @Override
    public List<Assignment> prioritize(List<Assignment> assignments) {
        System.out.println("Prioritizing by difficulty");
        return assignments;
    }
}
