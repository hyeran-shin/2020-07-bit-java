package com.bit.book.vo;

public class BookVO {
	private int no;
	private String isbn;
	private String title;
	private String autor;
	private int price;
	private int rental;
	@Override
	public String toString() {
		return "BookVO [no=" + no + ", isbn=" + isbn + ", title=" + title + ", autor=" + autor + ", price=" + price
				+ ", rental=" + rental + ", toString()=" + super.toString() + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRental() {
		return rental;
	}
	public void setRental(int rental) {
		this.rental = rental;
	}
	public BookVO(int no, String isbn, String title, String autor, int price, int rental) {
		super();
		this.no = no;
		this.isbn = isbn;
		this.title = title;
		this.autor = autor;
		this.price = price;
		this.rental = rental;
	}
	
	
	
}
