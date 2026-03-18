# System Requirements Document (SRD)

## 1. Introduction

This document defines the functional and non-functional requirements for the Student Assignment Tracker System. The requirements are derived from stakeholder needs and are designed to ensure system usability, performance, and reliability.

---

## 2. Functional Requirements

### FR1: User Registration
The system shall allow users to register an account using an email and password.
- Acceptance Criteria: User must provide a valid email and password.

### FR2: User Authentication
The system shall allow users to log in securely.
- Acceptance Criteria: Invalid login attempts must display an appropriate error message.

### FR3: Subject Management
The system shall allow users to create and manage subjects/modules.
- Acceptance Criteria: Subjects must be saved and displayed correctly.

### FR4: Assignment Creation
The system shall allow users to create assignments with a title and deadline.
- Acceptance Criteria: Assignment must include mandatory fields (title, deadline).

### FR5: Assignment Update
The system shall allow users to edit assignment details.
- Acceptance Criteria: Changes must be reflected immediately after update.

### FR6: Assignment Deletion
The system shall allow users to delete assignments.
- Acceptance Criteria: Deleted assignments must not appear in the system.

### FR7: Dashboard View
The system shall display all assignments in a dashboard view.
- Acceptance Criteria: Assignments must be sorted by upcoming deadlines.

### FR8: Assignment Completion
The system shall allow users to mark assignments as completed.
- Acceptance Criteria: Completed assignments must be visually distinguishable.

### FR9: Deadline Notifications
The system shall notify users of upcoming deadlines.
- Acceptance Criteria: Notifications must be triggered at least 24 hours before the deadline.

### FR10: Assignment History
The system shall allow users to view previously completed assignments.
- Acceptance Criteria: Completed assignments must be stored and retrievable.

---

## 3. Non-Functional Requirements

### Usability
NFR1: The system shall provide an intuitive and user-friendly interface.  
NFR2: The system shall be accessible on both desktop and mobile devices.

### Deployability
NFR3: The system shall be deployable on Windows and Linux environments.

### Maintainability
NFR4: The system shall include well-documented code and APIs.  
NFR5: The system shall follow a modular architecture to support future enhancements.

### Scalability
NFR6: The system shall support at least 1000 concurrent users.

### Security
NFR7: The system shall enforce authentication and authorization for all users.  
NFR8: The system shall protect user data using secure encryption protocols.

### Performance
NFR9: The system shall load dashboard data within 2 seconds under normal conditions.

---

## 4. Requirements Traceability Matrix

| Requirement ID | Stakeholder | Description |
|---------------|------------|------------|
| FR1 | Student | Enables account creation |
| FR2 | Student | Secure system access |
| FR3 | Student | Organize subjects |
| FR4 | Student, Lecturer | Manage assignments |
| FR5 | Student | Update assignment details |
| FR6 | Student | Remove assignments |
| FR7 | Student | View all assignments |
| FR8 | Student | Track completed work |
| FR9 | Student, Lecturer | Ensure deadlines are met |
| FR10 | Student | View assignment history |
| NFR1 | Student | Improve usability |
| NFR3 | IT Staff | Ensure deployability |
| NFR6 | University Management | Handle system growth |
| NFR7 | IT Staff | Ensure system security |
| NFR9 | Student | Fast system response |