package operations;

import model.Group;
import model.Student;

import java.util.List;

public interface StudentOperations {

    void addStudent(Student s);
    void editStudent(int id, String newName, int newId);
    void assignStudent(int studentId, Group group);
    Student findStudentbyId(int studentId);
    List<Student> getAllStudents();
}
