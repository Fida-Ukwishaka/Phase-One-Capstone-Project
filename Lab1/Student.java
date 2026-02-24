import java.util.HashMap;
import java.util.Map;

public abstract class Student extends Person{
    private int studentId;
    private String major;
    private double GPA;

    private Map<Course, Double> courses = new HashMap<>();

   

    Student(String name, int studentId, String major, double GPA){
        super(name);
        this.studentId = studentId;
        this.major = major;
        this.GPA = GPA;
    }

    public int getStudentId(){
        return studentId;
    }
    public String major(){
        return major;
    }
    public double GPA(){
        return GPA;
    }



    public void setStudentID(int id){
        this.studentId = id;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setGPA(double GPA){
        if (GPA < 0.0 || GPA > 4.0){
            throw new IllegalArgumentException("Invalid GPA");
        }
        this.GPA = GPA;
    }
    

    public void Attendance(Course course, Integer attendance){
        courses.putIfAbsent(course, 0.0);
    }

    public void Grades(Course course, double grade){
        courses.put(course, grade);
    }

    public double getGrade (Course course){
        return courses.getOrDefault(course, 0.0);
    }


    public abstract double calculateTuition();

    @Override
    public String getLevel(){
        return "Student";
    }

}


    

