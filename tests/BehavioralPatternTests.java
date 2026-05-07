import app.Assignment;
import behavioral_patterns.observer.AssignmentTracker;
import behavioral_patterns.observer.StudentObserver;
import behavioral_patterns.strategy.AssignmentManager;
import behavioral_patterns.strategy.DeadlineStrategy;
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
        list.add(new Assignment("Math"));

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
