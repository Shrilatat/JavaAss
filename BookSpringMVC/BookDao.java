package com.hsbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Book Dao implements methods from BookIntf
 * @author suryavanshi
 *
 */

@Repository
public class BookDao implements BookIntf{

	@Autowired
	JdbcTemplate jt;

	public List<Book> getAllBooks() {
		String sql = "select * from book";
		List<Book> b = jt.query(sql, new BeanPropertyRowMapper(Book.class));
		return b;
	}

	public Book getBookById(int id) {
		String sql = "select * from book";
		Book b = jt.queryForObject("select * from book where id=?", new Object[]{id},new BeanPropertyRowMapper(Book.class));
		return b;
	}

	public List<Book> getBooksByAuthor(String author) {
		
		List<Book> b = null;
		String sql = "select * from book";
		b = jt.query("select * from book where author =?", new Object[]{author}, new BeanPropertyRowMapper(Book.class));
		return b;
	} 

	public List<Book> getBooksByPublication(String publ) {

		String sql = "select * from book";
		List<Book> b = jt.query("select * from book where publication =?", new Object[]{publ}, new BeanPropertyRowMapper(Book.class));
		return b;
	} 

	public List<Book> getBooksContainingTitle(String name) {

		String str = "%" + name + "%";
		String sql = "select * from book where name like ?";
		List<Book> b=jt.query(sql, new Object[]{str}, new BeanPropertyRowMapper(Book.class));
		return b;
	} 

	public int addBook(Book b) {

		String sql = "insert into book values(?,?,?,?,?)";
		int val = jt.update(sql, new Object[] {b.getId(), b.getName(), b.getAuthor(), b.getPublication(), b.getPrice()});
		return val;
	}

	public int deleteBook(int id) {

		String sql = "delete from book where id=?";
		int val = jt.update(sql, new Object[] {id});
		return val;
	}

	public int increasePrice(Book book,int amt) {

		int id = book.getId();
		String sql = "update book set price=price+? where id=?";
		int val = jt.update(sql, new Object[] {amt,id});
		return val;
	}

	public String getAuthor(Book book) {

		int id = book.getId();
		String sql = "select author from book where id=?";
		String b = jt.queryForObject(sql, new Object[]{id}, String.class);
		return b;
	}

	public void updateBatchPrice(List<Book> list) {

		int val = 0;
		for(Book b : list){
			
			String publ = b.getPublication();
			System.out.println(publ);
			if(publ.equals("manning")) {
				val = jt.update("update book set price=price*1.1 where publication='manning'");
				System.out.println("Price of " + publ + " is increased by 10%");
			}
			else if(publ.equals("oreilly")) {
				val = jt.update("update book set price=price*1.15 where publication='oreilly'");
				System.out.println("Price of " + publ + " is increased by 15%");
			}
		}

	}
}