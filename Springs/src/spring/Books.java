package spring;

public class Books {
int bookID;
String booktitle;
String authName;
int isbnno;
String publication;
int price;

public Books(int bookID, String booktitle, String authName, int isbnno, String publication, int price) {
	this.bookID = bookID;
	this.booktitle = booktitle;
	this.authName = authName;
	this.isbnno = isbnno;
	this.publication = publication;
	this.price = price;
}
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
public String getBooktitle() {
	return booktitle;
}
public void setBooktitle(String booktitle) {
	this.booktitle = booktitle;
}
public String getAuthName() {
	return authName;
}
public void setAuthName(String authName) {
	this.authName = authName;
}
public int getIsbnno() {
	return isbnno;
}
public void setIsbnno(int isbnno) {
	this.isbnno = isbnno;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Books [bookID=" + bookID + ", booktitle=" + booktitle + ", authName=" + authName + ", isbnno=" + isbnno
			+ ", publication=" + publication + ", price=" + price + "]";
}

}
