package app;

/**
 * Represents a system notification.
 */
public class Notification {
    private String message;
    private String status;

    public Notification(String message) {
        this.message = message;
        this.status = "Pending";
    }

    public void send() {
        this.status = "Sent";
        System.out.println("app.Notification sent: " + message);
    }

    public void markAsRead() {
        this.status = "Read";
    }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
}
