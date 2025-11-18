package allclasses;

import java.util.ArrayList;
import java.util.List;

public class CourseStd {
    int id;
    String title;
    List<Student> enrolledStudents = new ArrayList<>();

    public CourseStd(int id, String title){
        this.id = id;
        this.title = title;
    }

    public void addStudent(Student s){
        if (!enrolledStudents.contains(s)) {
            enrolledStudents.add(s);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void displayCourses(){
        for (Student s : enrolledStudents) {
            System.out.println(s.getId() + " " + s.getName());
        }
    }
}