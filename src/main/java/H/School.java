package H;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class School {

    private ArrayList<Student> students;

    public School() {
        students=new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortStudentsByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    private int binarySearchStudentId(int studentId) {
        int left = 0;
        int right = students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentStudentId = students.get(mid).getStudentId();

            if (currentStudentId == studentId) {
                return mid;
            } else if (currentStudentId < studentId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Student ID not found
    }

public void writeFile(String fileName){

    try {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));

        for(Student Stu: students){
            writer.println(Stu.getDetails()+System.lineSeparator());
        }
        writer.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }


}

public void ReadFile(String fileName) {
    try (Scanner scanner = new Scanner(new File(fileName))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] keyValue = line.split(": ", 2); // Split into key and value
                if (keyValue.length == 2) {
                    // Your existing code to handle key-value pairs
                } else {
                    System.out.println("Invalid format in line: " + line);
                }
            }
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + fileName);
    }


    }
}

