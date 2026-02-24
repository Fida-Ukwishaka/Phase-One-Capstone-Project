public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;
    private double credits;
    private Student[] students;

    // constructor
    public Course(String courseName, String courseCode, Instructor instructor, double credits, Student[]
        students) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.instructor = instructor;
            this.credits = credits;
            this.students = students;
        }
    
    // getters and setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;     
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;     
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;     
    }
    public void setCredits(double credits) {
        this.credits = credits;     
    }
    public void setStudents(Student[] students) {
        this.students = students;     
    }


    public String getCourseName() {
        return courseName;     
    }
    public String getCourseCode() {
        return courseCode;     
    }
    public Instructor getInstructor() {
        return instructor;     
    }
    public double getCredits() {
        return credits;     
    }
    public Student[] getStudents() {
        return students;     
    }
    
}
