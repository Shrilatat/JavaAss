package spring;

public class BooksD {
int bookID;
String bookAuthor;
String publication;
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
public BooksD(int bookID, String bookAuthor, String publication) {
	this.bookID = bookID;
	this.bookAuthor = bookAuthor;
	this.publication = publication;
}
}
