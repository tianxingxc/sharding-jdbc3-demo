package com.tx;

import com.tx.dao.BbDao;
import com.tx.model.Student;
import com.tx.model.User;
import com.tx.service.StudentService;
import com.tx.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:datasources.xml", "classpath*:sharding.xml"})
public class AppTest {
    @Resource
    private UserService userService;

    @Resource
    private BbDao bbDao;

    @Resource
    private StudentService studentService;

    @Test
    public void testUserInsert() {
        userService.addSomeUsers();
    }

    @Test
    public void testStudentInsert() {
        Student student = new Student();
        student.setUserId(10L);
        student.setAge(20);
        student.setName("github");
        studentService.addStudent(student);
    }

    /**
     * 不支持存储过程
     */
    @Test
    public void bb() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        bbDao.bb(map);
        System.out.println(map);
    }
}
