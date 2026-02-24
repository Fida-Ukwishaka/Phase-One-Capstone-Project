import java.util.*;

public class UniversityManager {
  
  private Map<String, Student> students = new HashMap<>();
  private Map<String, Course> courses = new HashMap<>();

  public void registerStudent(String name, String major,double gpa) {
    String id = "ST-" + (students.size() + 1);
    Student student = new Student(id, name, major, gpa);
    students.put(id, student);
  }

  public void createCourse( String title, int capacity) {
    String courseId = "CS-" + (courses.size() + 1);
    Course course = new Course(courseId, title, capacity);
    courses.put(courseId, course);
  }

  public void enrollStudentInCourse(String studentId, String courseId)
  throws CourseFullException, StudentAlreadyEnrolledException
  {
      Student student = students.get(studentId);
      Course course = courses.get(courseId);
      if(course != null && student != null) {
        if(course.getEnrolledStudents().size() < course.getCapacity()) {
          course.getEnrolledStudents().add(student);
        } else {
          System.out.println("Course " + courseId + " is full. Cannot enroll student " + studentId);
          System.out.println();
        }
      } else {
        System.out.println("Invalid student ID or course ID.");
        System.out.println();
      }
    }

  public void displayStudents() {
    System.out.println("Registered Students:");
    for(Student student : students.values()) {
      System.out.println(student);
    }
  }

  public void averageGPA(String major){
    double totalGPA = 0;
    int count = 0;
    for(Student student : students.values()){
      if(student.getMajor().equals(major)) {
        totalGPA += student.getGpa();
        count++;
      }
    }
    if(count > 0) {
      System.out.println("Average GPA for " + major + ": " + (totalGPA / count));
      System.out.println();
    }
  }

  public void topStudent(){
    double maxGPA = 0.0;
    String result = "";
    for(Student student : students.values()){
      if (student.getGpa()>maxGPA){
        result = "The top performer is: "+ student.getName()+" (GPA = " + student.getGpa() + ")"; 
        maxGPA = student.getGpa();
      }
    }
    System.out.println(result);
    
  }

  public Collection<Student> getAllStudents() { return students.values(); }

  public Student getStudent(String id) { return students.get(id); }

  public List<Student> getDeansList() {
        return students.values().stream()
                .filter(s -> s.getGpa() > 3.5)
                .toList();
    }

}
