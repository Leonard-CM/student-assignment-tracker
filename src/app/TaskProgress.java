package app;

public class TaskProgress {
    private int completionRate;
    private String status;

    public TaskProgress() {
        this.completionRate = 0;
        this.status = "Not Started";
    }

    public void updateProgress(int completionRate) {
        this.completionRate = completionRate;

        if (completionRate == 100) {
            status = "Completed";
        } else if (completionRate > 0) {
            status = "In Progress";
        }
    }

    public int getCompletionRate() { return completionRate; }
    public String getStatus() { return status; }
}
