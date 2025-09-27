package behavioral.strategy;

public class OnTimeStrategy implements AssignmentStrategy {
    public String submit(String student, String assignment) {
        return student + " submitted '" + assignment + "' on time!";
    }
}