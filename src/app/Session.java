package app;

public class Session {
    private String status;

    public Session() {
        this.status = "Started";
    }

    public void start() { status = "Active"; }
    public void expire() { status = "Expired"; }
    public void end() { status = "Ended"; }

    public String getStatus() { return status; }
}
