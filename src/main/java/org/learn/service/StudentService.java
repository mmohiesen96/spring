package org.learn.service;

import org.learn.entitiy.Student;

import java.util.List;


public interface StudentService {
    void createStudent(Student student);

    List<Student> getStudentsByUniversityId(Integer id);

    void deleteStudent(Integer id);
}
