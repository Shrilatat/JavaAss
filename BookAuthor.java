package com.trg.bookAuthor;

public class BookAuthor {
int id;
double price;
Author author;
String title;
String pub;
int isbn;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPub() {
	return pub;
}
public void setPub(String pub) {
	this.pub = pub;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
@Override
public String toString() {
	return "BookAuthor [id=" + id + ", price=" + price + ", author=" + author + ", title=" + title + ", pub=" + pub
			+ ", isbn=" + isbn + "]";
}

}
