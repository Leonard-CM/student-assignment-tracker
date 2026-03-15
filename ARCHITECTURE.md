# Student Assignment Tracker System Architecture

## Domain
Education Management Systems

## Problem Statement
Students need an efficient way to manage assignments and academic deadlines in one centralized platform.

## Individual Scope
The system is designed to be developed by a single developer within four months and focuses on the core functionality required for assignment tracking and deadline management.

---

# C4 Architectural Model

## System Context Diagram

The System Context Diagram shows the interaction between the student and the assignment tracker system.
```mermaid
C4Context
title Student Assignment Tracker System Context

Person(student, "Student", "Manages assignments and deadlines")

System(system, "Assignment Tracker System", "Helps students manage assignments")

SystemDb(database, "Database", "Stores assignments and user data")

Rel(student, system, "Uses")
Rel(system, database, "Reads and writes data")
```

---

## Container Diagram
The System Context Diagram shows the interaction between the student and the assignment tracker system.
```mermaid
C4Container
title Assignment Tracker Containers

Person(student, "Student")

System_Boundary(system, "Assignment Tracker System") {

Container(web, "Web Application", "HTML/CSS/JavaScript", "User Interface")

Container(api, "Backend API", "Spring Boot", "Handles business logic")

ContainerDb(db, "Database", "MySQL", "Stores assignment data")

}

Rel(student, web, "Uses")
Rel(web, api, "API Requests")
Rel(api, db, "Reads/Writes")
```

---

## Component Diagram
The System Context Diagram shows the interaction between the student and the assignment tracker system.
```mermaid
C4Component
    title Backend Components

    Container(api, "Backend API")

    Component(auth, "Authentication Controller", "Handles login and registration")

    Component(assignments, "Assignment Controller", "Manages assignment operations")

    Component(service, "Assignment Service", "Business logic")

    Component(repo, "Repository", "Database access layer")

    Rel(auth, service, "Uses")
    Rel(assignments, service, "Uses")
    Rel(service, repo, "Reads/Writes")
```