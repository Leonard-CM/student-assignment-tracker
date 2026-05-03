package creational_patterns.prototype;

public class AssignmentPrototype implements Cloneable {

    private String title;

    public AssignmentPrototype(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    @Override
    public AssignmentPrototype clone() {
        try {
            return (AssignmentPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}