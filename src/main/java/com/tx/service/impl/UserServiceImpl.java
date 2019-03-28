package com.tx.service.impl;

import com.tx.dao.UserDao;
import com.tx.model.User;
import com.tx.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional  
public class UserServiceImpl implements UserService {
  
    @Resource
    private UserDao userDao;
  
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int addSomeUsers() {
        for(int i=0; i<10; i++) {
            User user = new User();
            user.setUserId(10L + i);
            user.setAge(25 + i);
            user.setName("github" + i);
            add(user);
            if(i == 5) {
                throw new RuntimeException("异常回滚...");
            }
        }

        return 0;
    }


} 
