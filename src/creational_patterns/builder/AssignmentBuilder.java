
package creational_patterns.builder;

import app.Assignment;

/**
 * Builder pattern for Assignment.
 */
public class AssignmentBuilder {

    private String title;

    public AssignmentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public Assignment build() {
        if (title == null) {
            throw new IllegalStateException("Title must be set");
        }
        return new Assignment(title);
    }
}