package com.app.creational_patterns.simple_factory;

import com.app.model.Assignment;

import java.util.UUID;


/**
 * Simple Factory for Assignment creation.
 */
public class AssignmentFactory {

    public static Assignment createAssignment(String title) {
        return new Assignment(
                UUID.randomUUID().toString(),
                title,
                "Pending"
        );
    }
}