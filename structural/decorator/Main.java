package structural.decorator;

import behavioral.observer.*;
import behavioral.strategy.*;
import creational.singleton.*;
import creational.factory.*;
import structural.adapter.*;
import structural.decorator.*;

public class Main {
    public static void main(String[] args) {
        // Observer: Add student and notify
        Classroom classroom = new Classroom();
        classroom.addObserver(studentName -> System.out.println("Observer: " + studentName + " joined."));
        classroom.addStudent("Raji");
        classroom.addStudent("Anu");

        // Strategy: Assignment submission policy
        AssignmentManager onTimeMgr = new AssignmentManager(new OnTimeStrategy());
        AssignmentManager lateMgr = new AssignmentManager(new LateStrategy());
        System.out.println(onTimeMgr.submitAssignment("Raji", "Math HW"));
        System.out.println(lateMgr.submitAssignment("Anu", "Math HW"));

        // Singleton: Logging
        Logger.getInstance().log("Classroom created and students added.");

        // Factory: User creation
        User teacher = UserFactory.createUser("Dr. Smith", "Teacher");
        User student = UserFactory.createUser("Raji", "Student");
        System.out.println(teacher.getInfo());
        System.out.println(student.getInfo());

        // Adapter: Add external student
        ExternalStudent extStud = new ExternalStudent("Abi");
        StudentAdapter adapter = new StudentAdapter(extStud);
        classroom.addStudent(adapter.getName());

        // Decorator: Assignment with attachment
        Assignment basicAssign = new Assignment() {
            public String getDetails() {
                return "Math Project";
            }
        };
        Assignment attachAssign = new AttachmentDecorator(basicAssign);
        System.out.println("Assignment: " + attachAssign.getDetails());
    }
}