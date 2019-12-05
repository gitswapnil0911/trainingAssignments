package com.training.service;

import com.training.dao.UserDao;
import com.training.model.Login;
import com.training.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
