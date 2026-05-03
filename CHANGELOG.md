## Assignment 10 – Creational Design Patterns Implementation

## Overview
This update introduces full implementation of all required creational design patterns, translation of UML class diagrams into Java code, and comprehensive unit testing to validate object creation logic.

## Added
Core Domain Classes (/src)
Implemented Assignment class with lifecycle state management (Pending → Completed)
Implemented User class with authentication behaviors (login/logout)
Implemented Subject class for organizing assignments
Implemented Notification class with status tracking (Pending → Sent → Read)
Implemented Dashboard class to aggregate and display assignment data
Implemented Session class to manage user session states
Implemented TaskProgress class to track assignment completion percentage
Creational Design Patterns (/src/creational_patterns)

## Simple Factory

Added AssignmentFactory to centralize creation of Assignment objects
Simplifies object instantiation and improves maintainability

## Factory Method
Introduced NotificationFactory interface
Implemented EmailNotificationFactory for creating notification objects
Enables flexible and extensible notification creation

## Abstract Factory
Created UIFactory interface for UI component families
Implemented WindowsFactory and WindowsButton
Demonstrates creation of related UI objects without tight coupling

## Builder
Implemented AssignmentBuilder for step-by-step object construction
Added validation to prevent invalid Assignment creation
Improves readability and scalability for complex object creation

## Prototype
Implemented AssignmentPrototype with cloning capability
Enables efficient duplication of existing objects

## Singleton
Implemented DatabaseConnection as a thread-safe singleton
Ensures only one shared instance exists across the system

## Improved
Enhanced Builder pattern with validation to handle edge cases (null/empty input)
Refactored Singleton implementation to ensure thread safety
Improved code readability with consistent naming conventions
Added inline documentation/comments to explain design decisions
Structured project into logical directories for better maintainability

## Testing (/tests)
Created PatternTests.java using JUnit 5
Implemented test cases for all six creational patterns:
Singleton → instance consistency validation
Builder → object construction validation
Prototype → cloning accuracy
Simple Factory → correct object creation
Factory Method → dynamic object creation
Abstract Factory → correct family object generation
Added edge case testing:
Builder invalid input handling (null title)
Validation of object state after creation

## Fixed
Resolved package structure issues causing compilation errors
Fixed import errors between domain classes and pattern implementations
Corrected default package usage to ensure compatibility with Java packaging rules
Addressed IntelliJ project configuration issues (source root and rebuild errors)

## GitHub Activity
Created issues for each design pattern implementation
Tracked progress using GitHub Project Board
Linked commits to corresponding issues for traceability
Moved completed tasks to "Done" column after validation
Documentation
Updated README.md with:
Pattern explanations and use cases
Project structure overview
Design decisions and justifications
Maintained structured documentation across assignments (A1–A10)

## Summary
This release completes the transition from UML design to a fully functional Java implementation.
All six creational design patterns have been successfully applied, tested, and documented, demonstrating strong understanding of object-oriented design principles and software engineering best practices.