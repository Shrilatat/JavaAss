package com.hsbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * DAO class to access database for book operations
 * @author ADITI GUPTA
 *
 */
@Repository
public class BookDao implements BookDaoImpl{

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getAllbooks() {
		String sql="select * from Books";
		List<Book> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public Book getBooksById(int bID) {
	
		String sql="select *from Books where bID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {bID},new BeanPropertyRowMapper(Book.class));
	}

	public List<Book> getBooksByAuthor(String bAuthor) {
	

		String sql="select *from Books where bAuthor=?";
		List<Book> list=jdbcTemplate.queryForObject(sql, new Object[] {bAuthor},new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public List<Book> getBooksByPuBhouse(String bPublication) {
	
		String sql="select * from Books where bPublication=?";
		List<Book> list=jdbcTemplate.query(sql,new Object[] {bPublication},new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public List<Book> getBookscontainingTitle(String bName) {
		
		String sql="select * from Books where bName LIKE =?";
		List<Book> list=jdbcTemplate.query(sql,new Object[] { "%" + bName + "%" },new BeanPropertyRowMapper(Book.class));
		return list;
	}

	public int addBook(Book book) {
		
		String sql="insert into Books values(?,?,?,?,?)";
		int i=jdbcTemplate.update(sql, book.getbID(), book.getbAuthor(),book.getbPublication(),book.getbName(),book.getBprice());
		return i;
		
	}

	public int deleteBook(int bID) {
		
		String sql="delete from Books where bID=?";
		int i=jdbcTemplate.update(sql,bID);
		return i;
	}

	public int increasePrice(Book book, int bPrice) {
		int bID=book.getbID();
		String sql=" update Books set bPrice = ? where bID = ?";
		int i=jdbcTemplate.update(sql, bPrice,bID);
		return i;
		
	}

	public int updatepriceAsBatch(List<Book> book) {
		
		for(Book b:book)
		{
			if(b.getbPublication().equals("Oreilly"))
			{
				int bPrice=b.getBprice();
				bPrice=(int) (bPrice+1.1*bPrice);
				String sql="update Books set bPrice = ?";
				int i=jdbcTemplate.update(sql,bPrice);
				return i;
			}
			if(b.getbPublication().equals("Degreed"))
			{
				int bPrice=b.getBprice();
				bPrice=(int) (bPrice+1.5*bPrice);
				String sql="update Books set bPrice = ?";
				int i=jdbcTemplate.update(sql,bPrice);
				return i;
			}
			
		}
		return 0;
	}

}
