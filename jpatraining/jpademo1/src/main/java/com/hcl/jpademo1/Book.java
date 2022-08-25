package com.hcl.jpademo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int id;
	private String title;
	private String author;
	private float price;
	
	public Book() {
		super();
	}

	public Book(int id, String title, String author, float price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
}
