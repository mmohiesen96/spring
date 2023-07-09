package org.learn.operation;

import org.learn.entitiy.Student;
import org.learn.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class StudentOperation implements StudentService {
    private static final Set<Student> students = new HashSet<>();

    @Override
    public void createStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getStudentsByUniversityId(Integer id) {
        return students.stream().filter((student -> student.getUniversity().getId().equals(id))).collect(Collectors.toList());
    }

    @Override
    public void deleteStudent(Integer id) {
        students.removeIf(student -> student.getStudentId().equals(id));
    }
}
