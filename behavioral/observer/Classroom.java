package behavioral.observer;

import java.util.*;

public class Classroom {
    private List<ClassroomObserver> observers = new ArrayList<>();
    private List<String> students = new ArrayList<>();

    public void addObserver(ClassroomObserver observer) {
        observers.add(observer);
    }
    public void addStudent(String studentName) {
        students.add(studentName);
        for (ClassroomObserver obs : observers) obs.onStudentAdded(studentName);
    }
    public List<String> getStudents() { return students; }
}