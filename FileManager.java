import java.io.*;
import java.util.Collection;

public class FileManager {

    public static void saveStudents(Collection<Student> students) {
        try (PrintWriter writer = new PrintWriter("students.txt")) {

            for (Student s : students) {
                writer.println(s.getId() + "," +
                               s.getName() + "," +
                               s.getMajor() + "," +
                               s.getGpa());
            }

        } catch (IOException e) {
            System.out.println("Error saving students.");
        }
    }
}
