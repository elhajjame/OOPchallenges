package allclasses;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private int id;
    private String name;
    private String specialization;
    private List<Course> coursesTaught;

    public Instructor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void addcours(Course c) {
        coursesTaught.add(c);
    }

    public void displayCourses() {
        for (Course c : coursesTaught) {
            System.out.println("ID: " + c.getId() + ", Title: " + c.getTitle() + ", Description: " + c.getDescription());

        }
    }

}
