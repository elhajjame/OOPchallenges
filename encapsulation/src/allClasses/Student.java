package allclasses;

import java.util.ArrayList;
import java.util.List;

public class Student{
    int id;
    String name;
    List<CourseStd> coursesTaken = new ArrayList<>();

    public Student( int id, String name){
        this.id = id;
        this.name = name;
    }

    public void enroll(CourseStd c){
        if (!coursesTaken.contains(c)) {
            coursesTaken.add(c);
            c.addStudent(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseStd> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(List<CourseStd> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void displayStudents(){
        for(CourseStd c : coursesTaken){
            System.out.println(c.getId() + " " +c.getTitle());
        }
    }
}