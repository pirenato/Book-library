package com.booklibrary.borrows;

import java.sql.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Borrows {
	
	private int borrowID;
	private int memberID;
	private int stockID;
	private Date dateOfBorrow;
	private Date dueDate;
	private Date dateOfReturn;
	
	
	public Borrows() {
		
	}


	public Borrows(int borrowID, int memberID, int stockID, Date dateOfBorrow, Date dueDate, Date dateOfReturn) {
		super();
		this.borrowID = borrowID;
		this.memberID = memberID;
		this.stockID = stockID;
		this.dateOfBorrow = dateOfBorrow;
		this.dueDate = dueDate;
		this.dateOfReturn = dateOfReturn;
	}


	public int getBorrowID() {
		return borrowID;
	}


	public void setBorrowID(int borrowID) {
		this.borrowID = borrowID;
	}


	public int getMemberID() {
		return memberID;
	}


	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}


	public int getStockID() {
		return stockID;
	}


	public void setStockID(int stockID) {
		this.stockID = stockID;
	}


	public Date getDateOfBorrow() {
		return dateOfBorrow;
	}


	public void setDateOfBorrow(Date dateOfBorrow) {
		this.dateOfBorrow = dateOfBorrow;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public Date getDateOfReturn() {
		return dateOfReturn;
	}


	public void setDateOfReturn(Date dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}
	
	
}
