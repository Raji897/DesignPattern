package structural.decorator;

public class AttachmentDecorator extends AssignmentDecorator {
    public AttachmentDecorator(Assignment assignment) { super(assignment); }
    public String getDetails() { return super.getDetails() + " [with attachment]"; }
}