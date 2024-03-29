package com.training.dao;

import com.training.model.Login;
import com.training.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void register(User user) {

        String sql = "insert into users values(?,?,?,?,?,?,?)";

        jdbcTemplate.update(sql, new Object[] {user.getUsername(), user.getPassword(), user.getFirstname(),user.getLastname(),user.getEmail(),user.getAddress(),user.getPhone()});
    }

    @Override
    public User validateUser(Login login) {
        String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()+"'";

        List<User> users =jdbcTemplate.query(sql, new UserMapper());

        return users.size() > 0 ? users.get(0) : null;
    }
}

class UserMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet rs, int arg1) throws SQLException {
        User user = new User();

        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setFirstname(rs.getString("firstname"));
        user.setLastname(rs.getString("lastname"));
        user.setEmail(rs.getString("email"));
        user.setAddress(rs.getString("address"));
        user.setPhone(rs.getInt("phone"));

        return user;
    }
}
