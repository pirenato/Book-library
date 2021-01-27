package com.booklibrary.stock;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Stock {
	
	private Integer stockID;
	private String author;
	private String title;
	private String category;
	private int numberOfCopies;
	
	public Stock() {
		
	}

	public Stock(Integer stockID, String author, String title, String category, int numberOfCopies) {
		super();
		this.stockID = stockID;
		this.author = author;
		this.title = title;
		this.category = category;
		this.numberOfCopies = numberOfCopies;
	}

	public Integer getStockID() {
		return stockID;
	}

	public void setStockID(Integer stockID) {
		this.stockID = stockID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	
}
