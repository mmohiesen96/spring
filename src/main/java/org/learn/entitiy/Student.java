package org.learn.entitiy;

public class Student {
    private static int count;
    private final Integer studentId = count++;
    private String studentNumber;
    private String studentName;
    private University university;

    public Student() {
    }

    public Student(String studentNumber, String studentName, University university) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", university=" + university +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public boolean equals(Object obj) {
        return this.studentId.equals(((Student) obj).studentId);
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}
