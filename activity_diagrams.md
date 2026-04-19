# Assignment 8 - Activity Diagrams

This document models system workflows using UML activity diagrams.

---

## 1. User Registration Workflow

```mermaid
flowchart TD
Start --> EnterDetails
EnterDetails --> ValidateInput
ValidateInput -->|Valid| CreateAccount
ValidateInput -->|Invalid| ShowError
CreateAccount --> SendVerificationEmail
SendVerificationEmail --> End
ShowError --> End
```

### Explanation
- This workflow begins when the user enters registration details
- A decision point validates the input
- If valid, the account is created and a verification email is sent
- If invalid, an error is shown
- Maps to:
    - FR-002: User authentication
    - US-001: Register Account

---

## 2. Login Workflow

```mermaid
flowchart TD
Start --> EnterCredentials
EnterCredentials --> ValidateCredentials
ValidateCredentials -->|Valid| LoadDashboard
ValidateCredentials -->|Invalid| ShowError
LoadDashboard --> End
ShowError --> End
```

### Explanation
- User enters login credentials
- System validates credentials
- Valid users access dashboard, invalid users see an error
- Maps to:
    - FR-002: Authentication
    - US-002: Login

---

## 3. Add Assignment Workflow

```mermaid
flowchart TD
Start --> SelectSubject
SelectSubject --> EnterAssignmentDetails
EnterAssignmentDetails --> SaveAssignment
SaveAssignment --> UpdateDashboard
UpdateDashboard --> End
```

### Explanation
- User selects a subject and enters assignment details
- Assignment is saved and dashboard is updated
- Maps to:
    - FR-001: Assignment management
    - US-004: Add Assignment

---

## 4. Edit Assignment Workflow

```mermaid
flowchart TD
Start --> SelectAssignment
SelectAssignment --> ModifyDetails
ModifyDetails --> SaveChanges
SaveChanges --> UpdateDashboard
UpdateDashboard --> End
```

### Explanation
- User selects an assignment and modifies details
- Changes are saved and reflected on the dashboard
- Maps to:
    - FR-001: Assignment management
    - US-005: Edit Assignment

---

## 5. Delete Assignment Workflow

```mermaid
flowchart TD
Start --> SelectAssignment
SelectAssignment --> ConfirmDeletion
ConfirmDeletion -->|Yes| DeleteAssignment
ConfirmDeletion -->|No| Cancel
DeleteAssignment --> UpdateDashboard
UpdateDashboard --> End
Cancel --> End
```

### Explanation
- User selects assignment and confirms deletion
- Decision ensures deletion is intentional
- Maps to:
    - FR-001: Assignment management
    - US-006: Delete Assignment

---

## 6. Dashboard Viewing Workflow

```mermaid
flowchart TD
Start --> LoadAssignments
LoadAssignments --> SortByDeadline
SortByDeadline --> DisplayAssignments
DisplayAssignments --> End
```

### Explanation
- System loads and organizes assignments
- Assignments are sorted by deadline and displayed
- Maps to:
    - FR-003: Dashboard functionality
    - US-007: View Dashboard

---

## 7. Notification Workflow (Parallel Processing)

```mermaid
flowchart TD
Start --> CheckDeadlines
CheckDeadlines -->|Due Soon| TriggerNotification

TriggerNotification --> SendEmail
TriggerNotification --> UpdateDashboard

SendEmail --> End
UpdateDashboard --> End
```

### Explanation
- System checks assignment deadlines
- If deadlines are near, notifications are triggered
- Parallel processes:
    - Sending email notification
    - Updating dashboard alerts
- Maps to:
    - FR-004: Deadline tracking
    - US-009: Notifications

---

## 8. Mark Assignment Complete Workflow

```mermaid
flowchart TD
Start --> SelectAssignment
SelectAssignment --> MarkAsComplete
MarkAsComplete --> UpdateStatus
UpdateStatus --> UpdateDashboard
UpdateDashboard --> End
```

### Explanation
- User selects an assignment and marks it complete
- System updates status and reflects changes on dashboard
- Maps to:
    - FR-004: Progress tracking
    - US-008: Mark Assignment Complete

---

## Traceability

These activity diagrams align with:

### Functional Requirements (Assignment 4)
- FR-001: Assignment management
- FR-002: User authentication
- FR-003: Dashboard functionality
- FR-004: Deadline tracking

### User Stories (Assignment 6)
- US-001: Register Account
- US-002: Login
- US-004: Add Assignment
- US-005: Edit Assignment
- US-006: Delete Assignment
- US-007: View Dashboard
- US-008: Mark Assignment Complete
- US-009: Notifications