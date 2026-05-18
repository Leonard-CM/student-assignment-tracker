package com.app.model;

import java.util.List;

public class Dashboard {
    private List<Assignment> assignments;

    public Dashboard(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public void load() {
        System.out.println("app.model.Dashboard loaded");
    }

    public void refresh() {
        System.out.println("app.model.Dashboard refreshed");
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
