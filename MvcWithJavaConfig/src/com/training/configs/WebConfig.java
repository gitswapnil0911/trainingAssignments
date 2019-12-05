package com.training.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.training")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ModelAndView mdlView(){

        return new ModelAndView();
    }

    @Bean
    public InternalResourceViewResolver resolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;

    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        dataSource.setUsername("oracle");
        dataSource.setPassword("oracle123");
        return dataSource;
    }

    @Bean
    public JdbcTemplate template() {
        return new JdbcTemplate(dataSource());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

}
