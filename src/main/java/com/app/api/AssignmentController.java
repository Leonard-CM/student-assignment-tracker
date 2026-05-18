package com.app.api;

import com.app.service.AssignmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.app.model.Assignment;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    private final AssignmentService service;

    public AssignmentController(AssignmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Assignment> getAllAssignments() {
        return service.getAllAssignments();
    }

    @PostMapping
    public Assignment createAssignment(@RequestBody Assignment assignment) {
        return service.createAssignment(assignment);
    }

    @PutMapping("/{id}")
    public Assignment updateAssignment(
            @PathVariable String id,
            @RequestBody Assignment assignment) {

        return service.updateAssignment(id, assignment);
    }

    @PostMapping("/{id}/complete")
    public Assignment completeAssignment(@PathVariable String id) {
        return service.completeAssignment(id);
    }
}
