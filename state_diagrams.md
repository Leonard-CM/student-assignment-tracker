# Assignment 8 - State Transition Diagrams

This document models the lifecycle of key system objects using UML state transition diagrams.

---

## 1. Assignment Object

```mermaid
stateDiagram-v2
    [*] --> Created
    Created --> Pending : Submit
    Pending --> InProgress : Start Work
    InProgress --> Submitted : Submit Assignment
    Submitted --> Completed : [if approved]
    Submitted --> Late : Deadline Passed
    Late --> Completed : Submit Late
    Completed --> [*]
```

### Explanation
- Key states: Created, Pending, InProgress, Submitted, Completed, Late
- Guard condition: Assignment only transitions to Completed if approved
- Transition:
    - "Submitted → Late" occurs when the deadline passes before submission
- This diagram models the full lifecycle of an assignment from creation to completion
- Maps to:
    - FR-001: Assignment management
    - FR-004: Deadline tracking
    - US-004: Add Assignment
    - US-008: Mark Assignment Complete

---

## 2. User Account Object

```mermaid
stateDiagram-v2
[*] --> Registered
Registered --> Active : Email Verified
Active --> LoggedIn : Login [if credentials valid]
LoggedIn --> LoggedOut : Logout
LoggedOut --> LoggedIn : Login Again
Active --> Suspended : Policy Violation
Suspended --> Active : Reinstated
```

### Explanation
- Key states: Registered, Active, LoggedIn, LoggedOut, Suspended
- Guard condition: Login only succeeds if credentials are valid
- Transition:
    - "Active → Suspended" occurs when user violates system policies
- This diagram represents the authentication and account lifecycle
- Maps to:
    - FR-002: User authentication
    - US-001: Register Account
    - US-002: Login

---

## 3. Subject Object

```mermaid
stateDiagram-v2
[*] --> Created
Created --> Active : Save Subject
Active --> Updated : Edit Subject
Updated --> Active
Active --> Deleted : Delete Subject
```

### Explanation
- Key states: Created, Active, Updated, Deleted
- Transition:
    - "Active → Updated" occurs when a subject is modified
- This diagram models how subjects are created, updated, and removed
- Maps to:
    - FR-001: Assignment organization
    - US-003: Create Subject

---

## 4. Notification Object

```mermaid
stateDiagram-v2
[*] --> Scheduled
Scheduled --> Sent : Trigger Time Reached
Sent --> Delivered
Delivered --> Read
Read --> Archived
```

### Explanation
- Key states: Scheduled, Sent, Delivered, Read, Archived
- Transition:
    - "Scheduled → Sent" is triggered when the notification time is reached
- This diagram represents the lifecycle of reminders and alerts
- Maps to:
    - FR-004: Deadline tracking
    - US-009: Notifications

---

## 5. Dashboard Object

```mermaid
stateDiagram-v2
[*] --> Loading
Loading --> Loaded : Data Retrieved
Loaded --> Refreshed : Refresh Requested
Refreshed --> Loaded
Loaded --> Error : Load Failure
Error --> Loading : Retry
```

### Explanation
- Key states: Loading, Loaded, Refreshed, Error
- Transition:
    - "Loaded → Error" occurs when data fails to load
- This diagram models system behavior when displaying assignment data
- Maps to:
    - FR-003: Dashboard functionality
    - US-007: View Dashboard

---

## 6. Session Object

```mermaid
stateDiagram-v2
[*] --> Started
Started --> Active : User Logged In
Active --> Expired : Timeout
Active --> Ended : Logout
Expired --> Ended
```

### Explanation
- Key states: Started, Active, Expired, Ended
- Guard condition: Session expires after inactivity timeout
- Transition:
    - "Active → Expired" occurs when the session times out
- This diagram ensures secure session management
- Maps to:
    - FR-002: Security and authentication
    - US-002: Login

---

## 7. Task Progress Object

```mermaid
stateDiagram-v2
[*] --> NotStarted
NotStarted --> InProgress : Start Task
InProgress --> Completed : Finish Task
InProgress --> Delayed : Deadline Missed
Delayed --> Completed : Resume and Finish
Completed --> [*]
```

### Explanation
- Key states: NotStarted, InProgress, Completed, Delayed
- Transition:
    - "InProgress → Delayed" occurs when a deadline is missed
- This diagram tracks assignment progress over time
- Maps to:
    - FR-004: Progress tracking
    - US-008: Mark Assignment Complete

---

## Traceability

These diagrams align with:

### Functional Requirements (Assignment 4)
- FR-001: Assignment management
- FR-002: User authentication
- FR-003: Dashboard functionality
- FR-004: Deadline tracking

### User Stories (Assignment 6)
- US-001: Register Account
- US-002: Login
- US-003: Create Subject
- US-004: Add Assignment
- US-007: View Dashboard
- US-008: Mark Assignment Complete
- US-009: Notifications