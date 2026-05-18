package java.services;

import com.app.repository.AssignmentRepository;
import com.app.service.AssignmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.app.model.Assignment;
public class AssignmentServiceTest {

    private AssignmentService service;

    @BeforeEach
    void setup() {
        service = new AssignmentService(new AssignmentRepository());
    }

    @Test
    void shouldCreateAssignment() {

        Assignment assignment =
                new Assignment("1", "Math", "Pending");

        Assignment created =
                service.createAssignment(assignment);

        assertEquals("Math", created.getTitle());
    }

    @Test
    void shouldCompleteAssignment() {

        Assignment assignment =
                new Assignment("1", "Science", "Pending");

        service.createAssignment(assignment);

        Assignment completed =
                service.completeAssignment("1");

        assertEquals("Completed", completed.getStatus());
    }

    @Test
    void shouldThrowExceptionForInvalidTitle() {

        Assignment assignment =
                new Assignment("1", "", "Pending");

        assertThrows(IllegalArgumentException.class,
                () -> service.createAssignment(assignment));
    }
}
