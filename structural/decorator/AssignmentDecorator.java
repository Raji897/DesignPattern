package structural.decorator;

public abstract class AssignmentDecorator implements Assignment {
    protected Assignment assignment;
    public AssignmentDecorator(Assignment assignment) { this.assignment = assignment; }
    public String getDetails() { return assignment.getDetails(); }
}