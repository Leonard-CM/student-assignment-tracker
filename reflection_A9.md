# Reflection - Assignment 9

Designing the domain model and class diagram presented several challenges. One of the main challenges was identifying the correct level of abstraction for entities. Initially, it was difficult to decide whether to combine certain entities or separate them. For example, separating TaskProgress from Assignment allowed better flexibility but required additional relationships.

Another challenge was defining relationships accurately. Understanding when to use association, aggregation, or composition required careful thought. For instance, TaskProgress was modeled as composition because it cannot exist without an Assignment, while Subject was modeled as aggregation since assignments can exist independently.

Aligning this assignment with previous work was critical. The domain model directly reflects functional requirements defined in Assignment 4, such as assignment management and authentication. The class diagram aligns with use cases from Assignment 5, including creating, editing, and deleting assignments. Additionally, state and activity diagrams from Assignment 8 influenced method design and system behavior modeling.

Trade-offs were also necessary. For example, inheritance could have been used for different types of users, but since the system focuses on a single user role, it was simplified. This decision reduced complexity and improved clarity.

One key lesson learned is the importance of clear relationships and separation of concerns in object-oriented design. Proper modeling ensures the system is scalable and easier to maintain. Additionally, using Mermaid.js helped visualize the system effectively, making it easier to understand interactions between components.

Overall, this assignment improved my understanding of domain driven design and UML modeling. It reinforced the importance of aligning design artifacts with requirements and ensuring consistency across all stages of system development.