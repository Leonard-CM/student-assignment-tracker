package app;

/**
 * Represents an academic assignment.
 */
public class Assignment {
    private String title;
    private String status;

    public Assignment(String title) {
        this.title = title;
        this.status = "Pending";
    }

    public void markComplete() {
        this.status = "Completed";
    }

    public String getTitle() { return title; }
    public String getStatus() { return status; }
}