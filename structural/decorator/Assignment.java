package structural.decorator;

public interface Assignment {
    String getDetails();
}


// package structural.decorator;

// public abstract class AssignmentDecorator implements Assignment {
//     protected Assignment assignment;
//     public AssignmentDecorator(Assignment assignment) { this.assignment = assignment; }
//     public String getDetails() { return assignment.getDetails(); }
// }

// package structural.decorator;

// public class AttachmentDecorator extends AssignmentDecorator {
//     public AttachmentDecorator(Assignment assignment) { super(assignment); }
//     public String getDetails() { return super.getDetails() + " [with attachment]"; }
// }