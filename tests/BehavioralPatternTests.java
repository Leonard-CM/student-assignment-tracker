import com.app.creational_patterns.builder.AssignmentBuilder;
import com.app.model.Assignment;
import com.app.behavioral_patterns.observer.AssignmentTracker;
import com.app.behavioral_patterns.observer.StudentObserver;
import com.app.behavioral_patterns.strategy.AssignmentManager;
import com.app.behavioral_patterns.strategy.DeadlineStrategy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BehavioralPatternTests {
    @Test
    void testStrategyPattern() {
        AssignmentManager manager = new AssignmentManager();

        List<Assignment> list = new ArrayList<>();
        list.add(new AssignmentBuilder()
                .setTitle("Math")
                .build());
        manager.setStrategy(new DeadlineStrategy());
        List<Assignment> result = manager.prioritize(list);

        assertNotNull(result);
    }

    @Test
    void testObserverPattern() {
        AssignmentTracker tracker = new AssignmentTracker();

        StudentObserver student = new StudentObserver("John");
        tracker.addObserver(student);

        tracker.assignmentUpdated("Assignment due tomorrow");

        assertTrue(true);
    }
}
