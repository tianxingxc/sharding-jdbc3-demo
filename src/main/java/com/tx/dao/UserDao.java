package com.tx.dao;

import com.tx.model.User;

import java.util.List;

public interface UserDao {

    Integer add(User user);

    List<User> listUsers();
}
