package com.tx;

import com.tx.dao.BbDao;
import com.tx.model.User;
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

    @Test
    public void testUserInsert() {
        User user = new User();
        user.setUserId(10L);
        user.setAge(25);
        user.setName("github");
        userService.add(user);
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
