import com.app.model.Assignment;
import com.app.creational_patterns.simple_factory.AssignmentFactory;
import com.app.model.Notification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.app.creational_patterns.singleton.DatabaseConnection;
import com.app.creational_patterns.builder.AssignmentBuilder;
import com.app.creational_patterns.prototype.AssignmentPrototype;
import com.app.creational_patterns.factory_method.EmailNotificationFactory;
import com.app.creational_patterns.abstract_factory.WindowsFactory;
import com.app.creational_patterns.abstract_factory.Button;



public class PatternTests {

    @Test
    public void testSingleton() {
        DatabaseConnection a = DatabaseConnection.getInstance();
        DatabaseConnection b = DatabaseConnection.getInstance();
        assertEquals(a, b);
    }

    @Test
    public void testBuilder() {
        Assignment a = new AssignmentBuilder().setTitle("Math").build();
        assertEquals("Math", a.getTitle());
    }

    @Test
    public void testPrototype() {
        AssignmentPrototype a1 = new AssignmentPrototype("Test");
        AssignmentPrototype a2 = a1.clone();
        assertEquals(a1.getTitle(), a2.getTitle());
    }

    @Test
    void testBuilderInvalid() {
        AssignmentBuilder builder = new AssignmentBuilder();
        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    public void testSimpleFactory() {
       Assignment a = AssignmentFactory.createAssignment("Science");
        assertEquals("Science", a.getTitle());
    }

    @Test
    public void testFactoryMethod() {
        EmailNotificationFactory factory = new EmailNotificationFactory();
       Notification n = factory.createNotification("Hello");
        assertTrue(n.getMessage().contains("Email"));
    }

    @Test
    public void testAbstractFactory() {
        WindowsFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        assertNotNull(button);
    }
}