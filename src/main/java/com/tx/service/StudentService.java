package com.tx.service;

import com.tx.model.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int batchAddStudent(List<Student> students);
}
