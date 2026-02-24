package lab2;
import java.util.*;

import Lab1.Course;
import Lab1.Student;
import lab2.exceptions.CourseFullException;
import lab2.exceptions.StudentAlreadyEnrolledException;

public class UniversityManager {


    private Map<String, Student> students = new HashMap<>();
    public void createCourse( String name, int capacity) {
    courses.put(courseId, course);
    }


    public void enrollStudentInCourse(String studentId, String courseId)
    throws CourseFullException, StudentAlreadyEnrolledException {
      Student student = students.get(studentId);
      Course course = courses.get(courseId);
      if(course != null && student != null) {
        if(course.getEnrolledStudents().size() < course.getCapacity()) {
          course.getEnrolledStudents().add(student);
        } else {
          System.out.println("Course " + courseId + " is full. Cannot enroll student " + studentId);
        } } else {
            System.out.println("Invalid student ID or course ID.");
      }
    }

    public void displayStudents() {
    System.out.println("Registered Students:");


}
}
