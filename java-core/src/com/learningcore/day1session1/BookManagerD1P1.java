package com.learningcore.day1session1;
import java.util.ArrayList;

class Book{
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String toString() {
		return "Book Title:"+title+ " and Price:"+price;
	}
}

public class BookManagerD1P1{
	private ArrayList<Book> books=new ArrayList<>();
	public void createBooks(String title, double price) {
		Book book=new Book();
		book.setTitle(title);
		book.setPrice(price);
		books.add(book);
	}

public void showBooks() {
	for(Book book:books) {
		System.out.println(book.toString());
	}
}

	public static void main(String[] args) {
		BookManagerD1P1 manager=new BookManagerD1P1();
		manager.createBooks("Java Programming", 350.00);
		manager.showBooks();
		// TODO Auto-generated method stub

	}
}

