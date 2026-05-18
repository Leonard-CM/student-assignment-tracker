# app.model.Assignment 9 - Class Diagram

This class diagram represents the system structure using UML and Mermaid.js.

```mermaid
classDiagram

class app.model.User {
    -userId: String
    -name: String
    -email: String
    -password: String
    +register()
    +login()
    +logout()
}

class app.model.Assignment {
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

class app.model.Subject {
    -subjectId: String
    -name: String
    -description: String
    +create()
    +update()
    +delete()
}

class app.model.Notification {
    -notificationId: String
    -message: String
    -date: Date
    -status: String
    +send()
    +markAsRead()
}

class app.model.Dashboard {
    -dashboardId: String
    +load()
    +refresh()
}

class app.model.Session {
    -sessionId: String
    -startTime: Date
    -endTime: Date
    -status: String
    +start()
    +expire()
    +end()
}

class app.model.TaskProgress {
    -progressId: String
    -status: String
    -completionRate: int
    +updateProgress()
}

app.model.User "1" --> "0..*" app.model.Assignment : manages
app.model.Subject "1" --> "0..*" app.model.Assignment : contains
app.model.User "1" --> "0..*" app.model.Notification : receives
app.model.User "1" --> "1" app.model.Session : owns
app.model.Assignment "1" --> "1" app.model.TaskProgress : tracked by
app.model.Dashboard "1" --> "0..*" app.model.Assignment : displays
```

---

## Explanation of Design Decisions

- The **app.model.User** class is central and manages assignments, sessions, and notifications.
- The **app.model.Assignment** class contains core business logic for tracking tasks.
- The **app.model.Subject** class organizes assignments into categories.
- The **app.model.Notification** class supports reminders for deadlines.
- The **app.model.Session** class ensures secure login management.
- The **app.model.TaskProgress** class tracks completion state separately for flexibility.
- The **app.model.Dashboard** aggregates assignment data for display.

### Relationship Types

- Association: app.model.User → app.model.Assignment
- Aggregation: app.model.Subject → app.model.Assignment
- Composition: app.model.Assignment → app.model.TaskProgress
- One-to-many relationships reflect real-world usage

This structure ensures scalability, maintainability, and alignment with object-oriented design principles.