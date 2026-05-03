package app;

public class Subject {
    private String subjectId;
    private String name;

    public Subject(String subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void delete() {
        System.out.println("app.Subject deleted");
    }

    public String getName() { return name; }
    public String getSubjectId() { return subjectId; }
}
