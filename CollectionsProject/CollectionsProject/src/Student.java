import java.util.ArrayList;
import java.util.List;

public class Student {
    public String nom;
    public int ID;
    public List<String> courses;

    public Student(String nom, int iD) {
        this.nom = nom;
        ID = iD;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);

    }

    public void removeCourse(String course) {
        courses.remove(course);

    }

    public String getNom() {
        return nom;
    }

    public int getID() {
        return ID;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

}