package H;

import java.text.MessageFormat;

public class Student extends Person implements ComparableById {

private int studentId;
private String course;

    public Student(String name, int age, String addrees, int studentId, String course) {
        super(name, age, addrees);
        setStudentId(studentId);
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId <= 0) {
            throw new IllegalArgumentException("Student ID must be a positive integer");
        }
            this.studentId = studentId;

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Student'{'name=''{0}'', age={1}, address=''{2}'', studentId={3}, course=''{4}'''}'", getName(), getAge(), getAddrees(), studentId, course);

    }

    @Override
    public String getDetails() {
        return super.getDetails()+ "StudentId; "+ studentId+"Course"+course;
    }

    @Override
    public boolean compareById(int id) {
        return studentId == id;
    }
}
