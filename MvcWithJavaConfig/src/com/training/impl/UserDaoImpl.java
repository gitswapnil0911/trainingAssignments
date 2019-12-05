package com.training.impl;

import com.training.entity.User;
import com.training.ifaces.UserDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate template;

    private static String tableName="users";

    @Override
    public int registerNewUser(User user) {
        String sql = "insert into " +tableName + " values(?,?,?,?)";

        int rowAdded = this.template.update(sql,user.getPassWord(),user.getUserContact(),user.getUserEmailId(),user.getUserName());

        return rowAdded;

    }

    @Override
    public User authenticateUser(String username, String password) {

        String sql = "select * from " + tableName + " where username = ? and password=?";

        User foundUser = this.template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),username,password);

        return foundUser;

    }
}
