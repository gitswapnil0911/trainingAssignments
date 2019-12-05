package com.training.service;

import com.training.model.Login;
import com.training.model.User;

public interface UserService {

    void register(User user);

    User validateUser(Login login);
}
