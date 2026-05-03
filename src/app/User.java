package app;

import java.util.List;

public class User {
    private String userId;
    private String name;
    private String email;

    private List<Assignment> assignments;
    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println(name + " logged in");
    }

    public void logout() {
        System.out.println(name + " logged out");
    }

    public String getName() { return name; }
    public String getUserId() { return userId; }
    public String getEmail() { return email; }
}
