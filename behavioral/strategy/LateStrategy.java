package behavioral.strategy;

public class LateStrategy implements AssignmentStrategy {
    public String submit(String student, String assignment) {
        return student + " submitted '" + assignment + "' late!";
    }
}