package org.learn;

import org.learn.entitiy.Student;
import org.learn.entitiy.University;
import org.learn.service.StudentService;
import org.learn.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    StudentService studentService;

    @Autowired
    UniversityService universityService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        University university = new University("BAU");
        University university2 = new University("PSUT");
        University university3 = new University("JU");
        Student student = new Student("010", "Mohammed", university);
        Student student2 = new Student("011", "Majd", university);
        Student student3 = new Student("013", "Mohammed", university);
        Student student4 = new Student("012", "Mohammed1", university);
        Student student5 = new Student("014", "Mohammed", university2);
        Student student6 = new Student("015", "Mohammed1", university2);
        Student student7 = new Student("016", "Mohammed", university3);
        Student student8 = new Student("017", "Mohammed1", university3);

        universityService.createUniversity(university);
        universityService.createUniversity(university2);
        universityService.createUniversity(university3);


        System.out.println(universityService.getUniversity(1));

        studentService.createStudent(student);
        studentService.createStudent(student2);
        studentService.createStudent(student3);
        studentService.createStudent(student4);
        studentService.createStudent(student5);
        studentService.createStudent(student6);
        studentService.createStudent(student7);
        studentService.createStudent(student8);

        System.out.println(studentService.getStudentsByUniversityId(0));
        System.out.println(studentService.getStudentsByUniversityId(1));
        System.out.println(studentService.getStudentsByUniversityId(2));
    }
}
