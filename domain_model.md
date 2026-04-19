# Assignment 9 - Domain Model

This document defines the core domain entities, attributes, methods, relationships, and business rules for the Student Assignment Tracker System.

---

## Domain Entities

| Entity | Attributes | Methods | Relationships |
|--------|-----------|--------|---------------|
| User | userId, name, email, password, status | register(), login(), logout() | 1 User → many Assignments |
| Assignment | assignmentId, title, description, deadline, status | create(), update(), delete(), markComplete() | Belongs to User, Subject |
| Subject | subjectId, name, description | create(), update(), delete() | 1 Subject → many Assignments |
| Notification | notificationId, message, date, status | send(), markAsRead() | Linked to User |
| Dashboard | dashboardId, summaryData | load(), refresh() | Displays Assignments |
| Session | sessionId, startTime, endTime, status | start(), expire(), end() | Linked to User |
| TaskProgress | progressId, status, completionRate | updateProgress() | Linked to Assignment |

---

## Relationships

- A **User** can manage multiple **Assignments**
- A **Subject** groups multiple **Assignments**
- A **Notification** is associated with a **User**
- A **Session** belongs to a **User**
- **TaskProgress** tracks progress of an **Assignment**
- The **Dashboard** displays all assignments for a user

---

## Business Rules

- A user must be registered before logging in
- A user can manage multiple assignments
- An assignment must belong to a subject
- An assignment cannot be marked complete before submission
- Notifications are triggered when deadlines are near
- A session expires after inactivity
- Task progress must be updated before marking assignment complete