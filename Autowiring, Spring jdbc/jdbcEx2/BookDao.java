package com.hsbc.jdbcEx2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BookDao {
	
	@Autowired
	JdbcTemplate jt;
	
	public List<Book> getAllBooks() {
		List<Book> b=jt.query("select * from bookstr", new BeanPropertyRowMapper(Book.class));
		return b;
	}
	
	public Book getBookById(int id) {
		Book b=jt.queryForObject("select * from bookstr where id=?",new Object[]{id},new BeanPropertyRowMapper(Book.class));
		return b;
	}
	
	public List<Book> getBooksByAuthor(String auth) {
		
		List<Book> b=jt.query("select * from bookstr where author =?",new Object[]{auth}, new BeanPropertyRowMapper(Book.class));
		return b;
	} 
	
	public List<Book> getBooksByPubHouse(String p) {
		
		List<Book> b=jt.query("select * from bookstr where pubhouse =?",new Object[]{p}, new BeanPropertyRowMapper(Book.class));
		return b;
	} 

	public List<Book> getBooksContainingTitle(String name) {
	String str="%"+name+"%";
	
	List<Book> b=jt.query("select * from bookstr where bname like ?",new Object[]{str}, new BeanPropertyRowMapper(Book.class));
	return b;
} 

	public int addBook(Book b) {
		int val=jt.update("insert into bookstr values(?,?,?,?,?)",new Object[] {b.getId(),b.getBname(),
				b.getAuthor(),b.getPubHouse(),b.getPrice()});
		return val;
	}
	
	public int deleteBook(int id) {
		int val=jt.update("delete from bookstr where id=?",new Object[] {id});
		return val;
	}
	
	public int increasePrice(Book book,int amnt) {
		int id=book.getId();
		
		int val=jt.update("update bookstr set price=price+? where id=?",new Object[] {amnt,id});
		return val;
	}
	
	public String getAuthor(Book book) {
		int id=book.getId();
		String b=jt.queryForObject("select author from bookstr where id=?",new Object[]{id},String.class);
		
		return b;
	}
	
	public void updateBatchPrice(List<Book> list) {
		int val=0;
		for(Book b:list){
			String pub=b.getPubHouse();
			System.out.println(pub);
			if(pub.equals("manning")) {
				val=jt.update("update bookstr set price=price+(price*0.10) where pubhouse='manning'");
				System.out.println(val);
			}
			else if(pub.equals("oreilly")) {
				val=jt.update("update bookstr set price=price+(price*0.15) where pubhouse='oreilly'");
				System.out.println(val);
			}
		}
		
	}
}
