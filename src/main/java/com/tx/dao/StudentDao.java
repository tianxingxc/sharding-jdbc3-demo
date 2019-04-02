package com.tx.dao;

import com.tx.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    int addStudent(Student student);
    int batchAddStudent(List<Student> students);
}
