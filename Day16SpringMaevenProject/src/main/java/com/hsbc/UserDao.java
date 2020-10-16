package com.hsbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

class EmpInfo {
	
	int eid;
	String ename;
	int sal;
	String dept;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmpInfo [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
}
@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void func() {
		String sql = "select * from empinfo";
		List<EmpInfo> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(EmpInfo.class));
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
//		1
//		UserDao dao = new UserDao();
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconn.xml");
//		JdbcTemplate jt = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
//		System.out.println(jt);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconn.xml");
		UserDao dao = ctx.getBean("userDao", UserDao.class);
		dao.func();

	}

}
