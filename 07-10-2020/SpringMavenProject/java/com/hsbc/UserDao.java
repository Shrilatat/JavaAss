package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public UserDao() {
		System.out.println(jdbcTemplate);
	}

	public void m1() {
		System.out.println(jdbcTemplate);
		int count = jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
		System.out.println(count);
	}

	public static void main(String[] args) {
		// UserDao dao = new UserDao();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconn.xml");
		UserDao dao = ctx.getBean("userDao", UserDao.class);
		dao.m1();
		// System.out.println(jdbcTemplate);
		// JdbcTemplate jt = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		// System.out.println(jt);
	}
}