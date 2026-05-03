package app;

import java.util.List;

public class Dashboard {
    private List<Assignment> assignments;

    public Dashboard(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public void load() {
        System.out.println("app.Dashboard loaded");
    }

    public void refresh() {
        System.out.println("app.Dashboard refreshed");
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
