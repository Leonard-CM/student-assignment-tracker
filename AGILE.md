# Agile Planning Document

## 1. User Stories

The following user stories are derived from functional requirements and use cases defined in previous assignments.

| Story ID | User Story | Acceptance Criteria | Priority |
|---------|-----------|--------------------|----------|
| US-001 | As a student, I want to register an account so that I can access the system | Valid email and password required | High |
| US-002 | As a student, I want to log in so that I can access my assignments | Invalid login shows error | High |
| US-003 | As a student, I want to create subjects so that I can organize assignments | Subject saved correctly | High |
| US-004 | As a student, I want to add assignments so that I can track deadlines | Assignment includes title and date | High |
| US-005 | As a student, I want to edit assignments so that I can update information | Changes saved instantly | Medium |
| US-006 | As a student, I want to delete assignments so that I can remove unnecessary tasks | Assignment removed from system | Medium |
| US-007 | As a student, I want to view a dashboard so that I can see all tasks | Tasks sorted by deadline | High |
| US-008 | As a student, I want to mark assignments complete so that I can track progress | Status updated visually | High |
| US-009 | As a student, I want deadline notifications so that I don’t miss submissions | Notification sent 24h before | High |
| US-010 | As an admin, I want secure authentication so that user data is protected | Unauthorized access denied | High |

## 2. Product Backlog

| Story ID | User Story | Priority (MoSCoW) | Effort (Story Points) | Dependencies |
|---------|-----------|------------------|----------------------|--------------|
| US-001 | Register account | Must-have | 3 | None |
| US-002 | Login | Must-have | 3 | US-001 |
| US-003 | Create subjects | Must-have | 2 | US-002 |
| US-004 | Add assignments | Must-have | 3 | US-003 |
| US-007 | View dashboard | Must-have | 3 | US-002 |
| US-008 | Mark complete | Should-have | 2 | US-004 |
| US-005 | Edit assignments | Should-have | 2 | US-004 |
| US-006 | Delete assignments | Could-have | 2 | US-004 |
| US-009 | Notifications | Should-have | 5 | US-004 |
| US-010 | Security | Must-have | 5 | None |

### Prioritization Justification

- Must have features are essential for delivering a functional MVP and align directly with stakeholder needs such as usability and task management.

- Should have features enhance usability and efficiency but are not critical for initial delivery.

- Could have features provide additional convenience but can be implemented later.

## 3. Sprint Planning

### Sprint Goal
The goal of this sprint is to deliver a Minimum Viable Product (MVP) that allows users to register, log in, create subjects, and manage assignments.

### Selected User Stories
- US-001 (Register)
- US-002 (Login)
- US-003 (Create Subject)
- US-004 (Add Assignment)
- US-007 (Dashboard)

---

## Sprint Backlog

| Task ID | Task Description | Assigned To | Estimated Hours | Status |
|--------|----------------|-------------|-----------------|--------|
| T-001 | Design database schema | Developer | 6 | To Do |
| T-002 | Implement registration API | Developer | 8 | To Do |
| T-003 | Implement login API | Developer | 8 | To Do |
| T-004 | Develop subject module | Developer | 6 | To Do |
| T-005 | Develop assignment module | Developer | 10 | To Do |
| T-006 | Build dashboard UI | Developer | 8 | To Do |

