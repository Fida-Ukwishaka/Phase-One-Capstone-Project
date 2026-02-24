import java.util.ArrayList;
import java.util.List;

public class Course {

  private String courseId;
  private String title;
  private int capacity;
  private List<Student> enrolledStudents;

  public Course(String courseId, String title, int capacity) {
    this.courseId = courseId;
    this.title = title;
    this.capacity = capacity;
    this.enrolledStudents = new ArrayList<>();
  }

  public String getCourseId() { return courseId; }
  public String getCourseTitle() { return title; }
  public int getCapacity() { return capacity; }
  public List<Student> getEnrolledStudents() { return enrolledStudents; }

  public void setCourseId(String courseId){this.courseId = courseId;}
  public void setTitle(String title){this.title = title;}
  public void setCapacity(int capacity){this.capacity = capacity;}
  public void setEnrolledStudents (Student students){
    this.enrolledStudents = new ArrayList<>();}

  @Override
  public String toString(){
      return courseId + " | " + title ;
    }
}

