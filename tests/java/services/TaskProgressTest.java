package java.services;

import com.app.model.TaskProgress;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for TaskProgress class.
 * 
 * This test suite covers:
 * - Default initialization
 * - Edge case tests (0, 100, boundary values, invalid ranges)
 * - Validation testing
 * - Status transitions
 */
@DisplayName("TaskProgress Unit Tests")
public class TaskProgressTest {

    private TaskProgress taskProgress;

    @BeforeEach
    void setUp() {
        taskProgress = new TaskProgress();
    }

    // ==================== Initialization Tests ====================

    @Test
    @DisplayName("Should initialize with default values")
    void testDefaultInitialization() {
        assertEquals(0, taskProgress.getCompletionRate(),
                "Completion rate should be initialized to 0");
        assertEquals("Not Started", taskProgress.getStatus(),
                "Status should be initialized to 'Not Started'");
    }

    // ==================== Edge Case Tests ====================

    @Test
    @DisplayName("Should handle zero completion rate")
    void testZeroCompletionRate() {
        taskProgress.updateProgress(0);
        assertEquals(0, taskProgress.getCompletionRate(),
                "Completion rate should remain 0");
        assertEquals("Not Started", taskProgress.getStatus(),
                "Status should remain 'Not Started' when completion rate is 0");
    }

    @Test
    @DisplayName("Should handle 100% completion rate")
    void testCompleteCompletion() {
        taskProgress.updateProgress(100);
        assertEquals(100, taskProgress.getCompletionRate(),
                "Completion rate should be 100");
        assertEquals("Completed", taskProgress.getStatus(),
                "Status should be 'Completed' when completion rate is 100");
    }

    @Test
    @DisplayName("Should handle minimum positive progress")
    void testMinimumPositiveProgress() {
        taskProgress.updateProgress(1);
        assertEquals(1, taskProgress.getCompletionRate(),
                "Completion rate should be 1");
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should be 'In Progress' for any positive completion rate less than 100");
    }

    @Test
    @DisplayName("Should handle mid-range completion rate")
    void testMidRangeProgress() {
        taskProgress.updateProgress(50);
        assertEquals(50, taskProgress.getCompletionRate(),
                "Completion rate should be 50");
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should be 'In Progress' for mid-range completion rate");
    }

    @Test
    @DisplayName("Should handle 99% completion rate")
    void testNearCompleteProgress() {
        taskProgress.updateProgress(99);
        assertEquals(99, taskProgress.getCompletionRate(),
                "Completion rate should be 99");
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should be 'In Progress' at 99% completion");
    }

    // ==================== Validation Tests ====================

    @ParameterizedTest
    @ValueSource(ints = {-1, -10, -100})
    @DisplayName("Should handle negative completion rates")
    void testNegativeCompletionRates(int negativeRate) {
        taskProgress.updateProgress(negativeRate);
        assertEquals(negativeRate, taskProgress.getCompletionRate(),
                "Completion rate should be set to the provided negative value");
        assertEquals("Not Started", taskProgress.getStatus(),
                "Status should remain 'Not Started' for negative completion rates");
    }

    @ParameterizedTest
    @ValueSource(ints = {101, 150, 200, 1000})
    @DisplayName("Should handle completion rates above 100")
    void testCompletionRatesAbove100(int overRate) {
        taskProgress.updateProgress(overRate);
        assertEquals(overRate, taskProgress.getCompletionRate(),
                "Completion rate should be set to the provided value even if above 100");
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should be 'In Progress' for values above 100 but less than 100 check fails");
    }

    // ==================== Status Transition Tests ====================

    @Test
    @DisplayName("Should transition from 'Not Started' to 'In Progress'")
    void testTransitionNotStartedToInProgress() {
        assertEquals("Not Started", taskProgress.getStatus(),
                "Initial status should be 'Not Started'");
        
        taskProgress.updateProgress(25);
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should transition to 'In Progress'");
    }

    @Test
    @DisplayName("Should transition from 'In Progress' to 'Completed'")
    void testTransitionInProgressToCompleted() {
        taskProgress.updateProgress(50);
        assertEquals("In Progress", taskProgress.getStatus(),
                "Initial status should be 'In Progress'");
        
        taskProgress.updateProgress(100);
        assertEquals("Completed", taskProgress.getStatus(),
                "Status should transition to 'Completed'");
    }

    @Test
    @DisplayName("Should transition from 'Completed' back to 'In Progress'")
    void testTransitionCompletedToInProgress() {
        taskProgress.updateProgress(100);
        assertEquals("Completed", taskProgress.getStatus(),
                "Status should be 'Completed'");
        
        taskProgress.updateProgress(75);
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should transition back to 'In Progress'");
    }

    @Test
    @DisplayName("Should transition from 'In Progress' back to 'Not Started'")
    void testTransitionInProgressToNotStarted() {
        taskProgress.updateProgress(50);
        assertEquals("In Progress", taskProgress.getStatus(),
                "Status should be 'In Progress'");
        
        taskProgress.updateProgress(0);
        assertEquals("Not Started", taskProgress.getStatus(),
                "Status should transition back to 'Not Started'");
    }

    @Test
    @DisplayName("Should transition from 'Completed' to 'Not Started'")
    void testTransitionCompletedToNotStarted() {
        taskProgress.updateProgress(100);
        assertEquals("Completed", taskProgress.getStatus(),
                "Status should be 'Completed'");
        
        taskProgress.updateProgress(0);
        assertEquals("Not Started", taskProgress.getStatus(),
                "Status should transition to 'Not Started'");
    }

    // ==================== Multiple Update Tests ====================

    @Test
    @DisplayName("Should handle multiple consecutive updates")
    void testMultipleConsecutiveUpdates() {
        // First update: 0 -> 25
        taskProgress.updateProgress(25);
        assertEquals(25, taskProgress.getCompletionRate());
        assertEquals("In Progress", taskProgress.getStatus());
        
        // Second update: 25 -> 50
        taskProgress.updateProgress(50);
        assertEquals(50, taskProgress.getCompletionRate());
        assertEquals("In Progress", taskProgress.getStatus());
        
        // Third update: 50 -> 100
        taskProgress.updateProgress(100);
        assertEquals(100, taskProgress.getCompletionRate());
        assertEquals("Completed", taskProgress.getStatus());
    }

    @Test
    @DisplayName("Should handle rapid progress changes")
    void testRapidProgressChanges() {
        int[] progressValues = {10, 30, 60, 90, 100, 50, 0};
        String[] expectedStatuses = {"In Progress", "In Progress", "In Progress", 
                                      "In Progress", "Completed", "In Progress", "Not Started"};
        
        for (int i = 0; i < progressValues.length; i++) {
            taskProgress.updateProgress(progressValues[i]);
            assertEquals(progressValues[i], taskProgress.getCompletionRate(),
                    "Completion rate should match at index " + i);
            assertEquals(expectedStatuses[i], taskProgress.getStatus(),
                    "Status should be '" + expectedStatuses[i] + "' at index " + i);
        }
    }

    // ==================== Boundary Value Tests ====================

    @Test
    @DisplayName("Should correctly identify boundary between 'Not Started' and 'In Progress'")
    void testBoundaryNotStartedVsInProgress() {
        // At 0: Not Started
        taskProgress.updateProgress(0);
        assertEquals("Not Started", taskProgress.getStatus());
        
        // At 1: In Progress
        taskProgress.updateProgress(1);
        assertEquals("In Progress", taskProgress.getStatus());
    }

    @Test
    @DisplayName("Should correctly identify boundary between 'In Progress' and 'Completed'")
    void testBoundaryInProgressVsCompleted() {
        // At 99: In Progress
        taskProgress.updateProgress(99);
        assertEquals("In Progress", taskProgress.getStatus());
        
        // At 100: Completed
        taskProgress.updateProgress(100);
        assertEquals("Completed", taskProgress.getStatus());
    }

    // ==================== State Consistency Tests ====================

    @Test
    @DisplayName("Should maintain state consistency after multiple operations")
    void testStateConsistency() {
        taskProgress.updateProgress(50);
        int rate1 = taskProgress.getCompletionRate();
        String status1 = taskProgress.getStatus();
        
        // Multiple get calls should return consistent values
        for (int i = 0; i < 5; i++) {
            assertEquals(rate1, taskProgress.getCompletionRate(),
                    "Completion rate should remain consistent");
            assertEquals(status1, taskProgress.getStatus(),
                    "Status should remain consistent");
        }
    }

    @Test
    @DisplayName("Should update status independently of completion rate type")
    void testStatusUpdateIndependence() {
        // Test with integer value
        taskProgress.updateProgress(50);
        assertEquals(50, taskProgress.getCompletionRate());
        assertEquals("In Progress", taskProgress.getStatus());
        
        // Update should work consistently
        taskProgress.updateProgress(100);
        assertEquals(100, taskProgress.getCompletionRate());
        assertEquals("Completed", taskProgress.getStatus());
    }
}
