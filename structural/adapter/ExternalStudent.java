package structural.adapter;

public class ExternalStudent {
    public String fullName;
    public ExternalStudent(String fullName) { this.fullName = fullName; }
}



// package structural.adapter;

// public class StudentAdapter {
//     private ExternalStudent extStudent;
//     public StudentAdapter(ExternalStudent ext) { this.extStudent = ext; }
//     public String getName() { return extStudent.fullName; }
// }