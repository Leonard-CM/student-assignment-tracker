# Assignment 9 - Class Diagram

This class diagram represents the system structure using UML and Mermaid.js.

```mermaid
classDiagram

class User {
    -userId: String
    -name: String
    -email: String
    -password: String
    +register()
    +login()
    +logout()
}

class Assignment {
    -assignmentId: String
    -title: String
    -description: String
    -deadline: Date
    -status: String
    +create()
    +update()
    +delete()
    +markComplete()
}

class Subject {
    -subjectId: String
    -name: String
    -description: String
    +create()
    +update()
    +delete()
}

class Notification {
    -notificationId: String
    -message: String
    -date: Date
    -status: String
    +send()
    +markAsRead()
}

class Dashboard {
    -dashboardId: String
    +load()
    +refresh()
}

class Session {
    -sessionId: String
    -startTime: Date
    -endTime: Date
    -status: String
    +start()
    +expire()
    +end()
}

class TaskProgress {
    -progressId: String
    -status: String
    -completionRate: int
    +updateProgress()
}

User "1" --> "0..*" Assignment : manages
Subject "1" --> "0..*" Assignment : contains
User "1" --> "0..*" Notification : receives
User "1" --> "1" Session : owns
Assignment "1" --> "1" TaskProgress : tracked by
Dashboard "1" --> "0..*" Assignment : displays
```

---

## Explanation of Design Decisions

- The **User** class is central and manages assignments, sessions, and notifications.
- The **Assignment** class contains core business logic for tracking tasks.
- The **Subject** class organizes assignments into categories.
- The **Notification** class supports reminders for deadlines.
- The **Session** class ensures secure login management.
- The **TaskProgress** class tracks completion state separately for flexibility.
- The **Dashboard** aggregates assignment data for display.

### Relationship Types

- Association: User → Assignment
- Aggregation: Subject → Assignment
- Composition: Assignment → TaskProgress
- One-to-many relationships reflect real-world usage

This structure ensures scalability, maintainability, and alignment with object-oriented design principles.