package com.app.repository;

import org.springframework.stereotype.Repository;

import java.util.*;
import com.app.model.Assignment;

@Repository
public class AssignmentRepository {

    private final Map<String, Assignment> assignments = new HashMap<>();

    public List<Assignment> findAll() {
        return new ArrayList<>(assignments.values());
    }

    public Optional<Assignment> findById(String id) {
        return Optional.ofNullable(assignments.get(id));
    }

    public Assignment save(Assignment assignment) {
        assignments.put(assignment.getId(), assignment);
        return assignment;
    }

    public void delete(String id) {
        assignments.remove(id);
    }
}