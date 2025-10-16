package behavioral.strategy;

public class LateStrategy implements AssignmentStrategy {
    public String submit(String student, String assignment) {
        return student + " submitted '" + assignment + "' late!";
    }
}

// package behavioral.strategy;

// public class OnTimeStrategy implements AssignmentStrategy {
//     public String submit(String student, String assignment) {
//         return student + " submitted '" + assignment + "' on time!";
//     }
// }

// package behavioral.strategy;

// public interface AssignmentStrategy {
//     String submit(String student, String assignment);
// }

// package behavioral.strategy;

// public class AssignmentManager {
//     private AssignmentStrategy strategy;
//     public AssignmentManager(AssignmentStrategy strategy) { this.strategy = strategy; }
//     public String submitAssignment(String student, String assignment) {
//         return strategy.submit(student, assignment);
//     }
// }