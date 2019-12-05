package com.training.config;

import com.training.apps.MedicineDao;
import com.training.beans.Medicine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class DbConfig {

    @Bean
    public DataSource dbSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        dataSource.setUsername("oracle");
        dataSource.setPassword("oracle123");

        return dataSource;
    }

    @Bean
    public JdbcTemplate template(){
        return new JdbcTemplate(dbSource());
    }

    @Bean
    public MedicineDao dao(){
        return new MedicineDao();
    }

    @Bean
    public Medicine medicine(){
        return new Medicine();
    }

}
