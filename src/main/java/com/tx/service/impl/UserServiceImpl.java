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

      
} 
