package com.training.dao;

import com.training.model.Login;
import com.training.model.User;

public interface UserDao {

    void register(User user);

    User validateUser(Login login);
}
