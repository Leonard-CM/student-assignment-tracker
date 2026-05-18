package com.app.service;

import com.app.repository.AssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import com.app.model.Assignment;

@Service
public class AssignmentService {

    private final AssignmentRepository repository;

    public AssignmentService(AssignmentRepository repository) {
        this.repository = repository;
    }

    public List<Assignment> getAllAssignments() {
        return repository.findAll();
    }

    public Assignment createAssignment(Assignment assignment) {

        if (assignment.getTitle() == null || assignment.getTitle().isBlank()) {
            throw new IllegalArgumentException("Assignment title cannot be empty");
        }

        assignment.setStatus("Pending");

        return repository.save(assignment);
    }

    public Assignment updateAssignment(String id, Assignment updated) {

        Assignment existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));

        existing.setTitle(updated.getTitle());
        existing.setStatus(updated.getStatus());

        return repository.save(existing);
    }

    public Assignment completeAssignment(String id) {

        Assignment assignment = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));

        assignment.setStatus("Completed");

        return repository.save(assignment);
    }
}
