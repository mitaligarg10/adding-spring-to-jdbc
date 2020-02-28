package com.stackroute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class JdbcDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JdbcDaoImpl dao = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
        Circle circle = dao.getCircle(2);
        System.out.println(circle.getName());
    }
}
