import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Student extends Person implements Validatable, Tuition {
    private int studentID;
    private Academic level;
    private String major;
    private double GPA;

    private Map<Course, Course> courses = new HashMap<>();

    private static final double flatRate = 5000.0;
    private static final double perCreditRate = 300.0;
    private static final double researchFee = 1000.0;

    Student(int studentID,String name, int age, Academic level, String major, double GPA) {
        super(name, age);
        this.studentID = studentID;
        this.level = level;
        this.major = major;
        this.GPA = GPA;
    }



}
