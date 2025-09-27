package structural.adapter;

public class StudentAdapter {
    private ExternalStudent extStudent;
    public StudentAdapter(ExternalStudent ext) { this.extStudent = ext; }
    public String getName() { return extStudent.fullName; }
}