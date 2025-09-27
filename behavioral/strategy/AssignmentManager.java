package behavioral.strategy;

public class AssignmentManager {
    private AssignmentStrategy strategy;
    public AssignmentManager(AssignmentStrategy strategy) { this.strategy = strategy; }
    public String submitAssignment(String student, String assignment) {
        return strategy.submit(student, assignment);
    }
}