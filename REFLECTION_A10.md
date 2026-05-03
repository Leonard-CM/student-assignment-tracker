Overview

Assignment 10 focused on transforming a UML class diagram into a fully functional Java implementation while applying all six creational design patterns. The objective was not only to implement working code, but also to demonstrate a clear understanding of object-oriented design principles and different strategies for object creation.

Key Learnings
1. Bridging Design and Implementation

One of the most valuable aspects of this assignment was translating the class diagram into code. While the UML diagram provided a structural blueprint, implementing it required deeper consideration of:

Class responsibilities
Method behavior
Data encapsulation

This process reinforced the importance of design accuracy, as inconsistencies in the diagram quickly became evident during implementation.

2. Understanding Creational Design Patterns

Implementing all six creational patterns provided practical insight into how and when each pattern should be used.

Simple Factory simplified object creation and reduced duplication.
Factory Method introduced flexibility by delegating object creation to subclasses.
Abstract Factory demonstrated how to create families of related objects without tight coupling.
Builder improved readability and control when constructing objects with multiple steps.
Prototype highlighted efficient object duplication through cloning.
Singleton emphasized controlled access to shared resources.

This assignment clarified that design patterns are not just theoretical concepts, but practical tools for improving system design.

3. Importance of Code Structure and Packaging

Initially, managing package structures and imports presented challenges, particularly when dealing with Java’s strict packaging rules. Resolving these issues improved my understanding of:

Source root configuration
Package naming conventions
Dependency management between classes

A well-organized project structure proved essential for maintaining clean and scalable code.

4. Testing and Validation

Writing unit tests using JUnit 5 reinforced the importance of validating not only functionality but also design behavior.

Key insights included:

Ensuring each pattern behaves as expected
Testing edge cases (e.g., invalid builder input)
Verifying singleton instance consistency

Testing highlighted potential weaknesses early and increased confidence in the correctness of the implementation.

5. Problem-Solving and Debugging

During development, several issues were encountered, including:

Package mismatch errors
Import resolution problems
Project configuration inconsistencies in IntelliJ

Resolving these required systematic debugging and reinforced the importance of understanding the development environment, not just the code.

Challenges Faced
Managing Java package structures correctly
Ensuring all patterns were properly integrated into the system
Avoiding overcomplication while still meeting all requirements
Debugging build and compilation errors

These challenges were valuable in developing problem-solving skills and attention to detail.

Conclusion

This assignment significantly improved my understanding of how design patterns are applied in real-world systems. It demonstrated the importance of clean architecture, proper object creation strategies, and thorough testing.

Overall, the experience strengthened my ability to move from conceptual design to implementation, while maintaining code quality and adhering to software engineering principles.