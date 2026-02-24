import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

  private String id;
  private double gpa;
  private String major;
  private Map<Course, Double> courses = new HashMap<>();

  public Student(String id, String name, String major, double gpa) {
    super(name);
    this.id = id;
    this.gpa = gpa;
    this.major = major;
  }

  public String getId() { return id;}
  public double getGpa() { return gpa;}
  public String getMajor() { return major;}

  public void setId(String id) { this.id = id;}
  public void setGpa(double gpa) { this.gpa = gpa;}
  public void setMajor(String major) { this.major = major;}
  
  public Map<Course, Double> getCourses() { return courses; }

  @Override
  public double calculateTuition() {
    return 500; 
  }
  
  @Override
  public String toString() {
    return name + "( GPA = " + gpa + ", major = " + major + " )";
  }

   

}
