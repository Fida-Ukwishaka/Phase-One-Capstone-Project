// public class Main {
//     public static void main(String[] args) {
        
//         UniversityManager universityManager = new UniversityManager();
//         universityManager.registerStudent("Magujye", "Computer Science", 3.8);
//         universityManager.registerStudent("Bihehe Kabebe", "Computer Science", 1.5);

//         universityManager.registerStudent("Divine", "Mathematics", 4.0);
//         universityManager.registerStudent("Blaise", "Physics", 2.2);
    
//         universityManager.createCourse("Data Structures", 2);
//         universityManager.createCourse("Calculus", 3);

//         try{

//             universityManager.enrollStudentInCourse("ST-1", "CS-1");
//             universityManager.enrollStudentInCourse("ST-2", "CS-2");

//             // Attempt to enroll a student in a full course
//             universityManager.enrollStudentInCourse("ST-3", "CS-5");
//             universityManager.enrollStudentInCourse("ST-30", "CS-4");
//         } 
//         catch(CourseFullException | StudentAlreadyEnrolledException e){
//             System.out.println("Enrollment error: " + e.getMessage());
//         }

//         // display all registered students
//         universityManager.displayStudents(); 
//         universityManager.averageGPA("Computer Science");
//         universityManager.topStudent();

//         // saving students to file
//         FileManager.saveStudents(universityManager.getAllStudents());
//             System.out.println("Data recorded successfully!");
//     }
// }




import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UniversityManager manager = new UniversityManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== UNIVERSITY SYSTEM =====");
            System.out.println("1. Register Student");
            System.out.println("2. Create Course");
            System.out.println("3. Enroll in Course");
            System.out.println("4. View Student Record");
            System.out.println("5. Generate Dean's List");
            System.out.println("6. Save and Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Major: ");
                        String major = scanner.nextLine();

                        System.out.print("GPA: ");
                        double gpa = scanner.nextDouble();

                        manager.registerStudent(name, major, gpa);
                        System.out.println("Student registered.");
                    }

                    case 2 -> {
                        System.out.print("Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Capacity: ");
                        int cap = scanner.nextInt();
                        scanner.nextLine();

                        manager.createCourse(title, cap);
                        System.out.println("Course created.");
                    }

                    case 3 -> {
                        System.out.print("Student ID: ");
                        String sid = scanner.nextLine();

                            

                        System.out.print("Course Code: ");
                        String cc = scanner.nextLine();

                        manager.enrollStudentInCourse(sid, cc);
                        System.out.println("Enrollment successful.");
                    }

                    case 4 -> {
                        System.out.print("Student ID: ");
                        String sid = scanner.nextLine();

                        Student s = manager.getStudent(sid);
                        System.out.println("Name: " + s.getName());
                        System.out.println("GPA: " + s.getGpa());
                        System.out.println("Courses: " + s.getCourses().keySet());
                        System.out.println("Tuition: $" + s.calculateTuition());
                    }

                    case 5 -> {
                        manager.getDeansList()
                                .forEach(s -> System.out.println(s.getName() + " - " + s.getGpa()));
                    }

                    case 6 -> {
                        FileManager.saveStudents(manager.getAllStudents());
                        System.out.println("Data saved. Goodbye!");
                        return;
                    }

                    default -> System.out.println("Invalid choice.");
                }

            } catch (CourseFullException | StudentAlreadyEnrolledException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}