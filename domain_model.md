# app.model.Assignment 9 - Domain Model

This document defines the core domain entities, attributes, methods, relationships, and business rules for the Student app.model.Assignment Tracker System.

---

## Domain Entities

| Entity | Attributes | Methods | Relationships |
|--------|-----------|--------|---------------|
| app.model.User | userId, name, email, password, status | register(), login(), logout() | 1 app.model.User → many Assignments |
| app.model.Assignment | assignmentId, title, description, deadline, status | create(), update(), delete(), markComplete() | Belongs to app.model.User, app.model.Subject |
| app.model.Subject | subjectId, name, description | create(), update(), delete() | 1 app.model.Subject → many Assignments |
| app.model.Notification | notificationId, message, date, status | send(), markAsRead() | Linked to app.model.User |
| app.model.Dashboard | dashboardId, summaryData | load(), refresh() | Displays Assignments |
| app.model.Session | sessionId, startTime, endTime, status | start(), expire(), end() | Linked to app.model.User |
| app.model.TaskProgress | progressId, status, completionRate | updateProgress() | Linked to app.model.Assignment |

---

## Relationships

- A **app.model.User** can manage multiple **Assignments**
- A **app.model.Subject** groups multiple **Assignments**
- A **app.model.Notification** is associated with a **app.model.User**
- A **app.model.Session** belongs to a **app.model.User**
- **app.model.TaskProgress** tracks progress of an **app.model.Assignment**
- The **app.model.Dashboard** displays all assignments for a user

---

## Business Rules

- A user must be registered before logging in
- A user can manage multiple assignments
- An assignment must belong to a subject
- An assignment cannot be marked complete before submission
- Notifications are triggered when deadlines are near
- A session expires after inactivity
- Task progress must be updated before marking assignment complete