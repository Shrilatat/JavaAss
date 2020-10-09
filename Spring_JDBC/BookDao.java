package com.hsbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * 
 * @author Abhinav Srivastava
 *
 */
@Repository
public class BookDao implements BookDaoImpl{

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getAllbooks() {
		String sql="select * from myBooks";
		List<Book> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public Book getBooksById(int bID) {
	
		String sql="select *from myBooks where bID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {bID},new BeanPropertyRowMapper(Book.class));
	}

	public List<Book> getBooksByAuthor(String bAuthor) {
	

		String sql="select *from myBooks where bAuthor=?";
		List<Book> list=jdbcTemplate.queryForObject(sql, new Object[] {bAuthor},new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public List<Book> getBooksByPuBhouse(String bPublication) {
	
		String sql="select * from myBooks where bPublication=?";
		List<Book> list=jdbcTemplate.query(sql,new Object[] {bPublication},new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public List<Book> getBookscontainingTitle(String bName) {
		
		String sql="select * from myBooks where bName LIKE =?";
		List<Book> list=jdbcTemplate.query(sql,new Object[] { "%" + bName + "%" },new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public int addBook(Book book) {
		
		String sql="insert into myBooks values(?,?,?,?,?)";
		int i=jdbcTemplate.update(sql, book.getbID(), book.getbAuthor(),book.getbPublication(),book.getbName(),book.getBprice());
		return i;
		
	}

	public int deleteBook(int bID) {
		
		String sql="delete from myBooks where bID=?";
		int i=jdbcTemplate.update(sql,bID);
		return i;
	}

	public int increasePrice(Book book, int bPrice) {
		int bID=book.getbID();
		String sql=" update myBooks set bPrice = ? where bID = ?";
		int i=jdbcTemplate.update(sql, bPrice,bID);
		return i;
		
	}

	public int updatepriceAsBatch(List<Book> book) {
		
		for(Book b:book)
		{
			if(b.getbPublication().equals("APC"))
			{
				int bPrice=b.getBprice();
				bPrice=(int) (bPrice+1.1*bPrice);
				String sql="update myBooks set bPrice = ?";
				int i=jdbcTemplate.update(sql,bPrice);
				return i;
			}
			if(b.getbPublication().equals("O'reilly"))
			{
				int bPrice=b.getBprice();
				bPrice=(int) (bPrice+1.5*bPrice);
				String sql="update myBooks set bPrice = ?";
				int i=jdbcTemplate.update(sql,bPrice);
				return i;
			}
			
		}
		return 0;
	}

}
