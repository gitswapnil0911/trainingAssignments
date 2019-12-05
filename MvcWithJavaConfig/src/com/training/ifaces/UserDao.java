package com.training.ifaces;

import com.training.entity.User;
import org.springframework.web.servlet.ModelAndView;

public interface UserDao {

    public int registerNewUser(User user);
    public User authenticateUser(String username, String password);
}
