
package com.app.creational_patterns.builder;

import com.app.model.Assignment;

import java.util.UUID;

/**
 * Builder pattern for Assignment.
 */
public class AssignmentBuilder {

    private String id;
    private String title;
    private String status = "Pending";

    public AssignmentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public AssignmentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public AssignmentBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public Assignment build() {

        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Title must be set");
        }

        if (id == null) {
            id = UUID.randomUUID().toString();
        }

        return new Assignment(id, title, status);
    }
}