package creational_patterns.simple_factory;


import app.Assignment;

/**
 * Simple Factory for Assignment creation.
 */
public class AssignmentFactory {
    public static Assignment createAssignment(String title) {
        return new Assignment(title);
    }
}