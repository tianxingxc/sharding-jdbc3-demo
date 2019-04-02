package com.tx.service.impl;

import com.tx.dao.StudentDao;
import com.tx.model.Student;
import com.tx.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int batchAddStudent(List<Student> students) {
        return studentDao.batchAddStudent(students);
    }
}
