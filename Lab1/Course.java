import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String title;
    private double credits;

    private List<Student> roster = new ArrayList<>();


    Course(String courseCode, String title, double credits){
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
    }

    public void addStudent(Student student){
        if (!roster.contains(student)){
            roster.add(student);
            
        }
    }

    public List<Student> getRoster(){
        return roster;
    }

    @Override
    public String toString(){
        return courseCode + " | " + title + " | " + credits + " credits.";
    }

}
