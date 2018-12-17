/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *|                                                                        |
 *| EJB 3.0 Online Library                                                 |
 *|                                                                        |
 *| Copyright IBM Corp. 2008.  All Rights Reserved.                  	   |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *|                                                                        |
 *| Use restricted, please refer to the "Restricted Materials" terms and   |
 *| conditions in the IBM International Program License Agreement.         |
 *+------------------------------------------------------------------------+
 */
package entities;

import entities.Book;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: BookLoan
 *
 */
@Entity

public class BookLoan implements Serializable {

	
	private Date borrowingDate;
	private int borrowPeriod;
	private Date returnDate;
	private Book book;   
	private Customer customer;
	@Id
	private int bookLoanId;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Customer customer1;
	@ManyToOne
	private Book book1;

	public BookLoan() {
		super();
	}   
	public Date getBorrowingDate() {
		return this.borrowingDate;
	}

	public void setBorrowingDate(Date borrowingDate) {
		this.borrowingDate = borrowingDate;
	}   
	public int getBorrowPeriod() {
		return this.borrowPeriod;
	}

	public void setBorrowPeriod(int borrowPeriod) {
		this.borrowPeriod = borrowPeriod;
	}   
	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}   
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}   
	public int getBookLoanId() {
		return this.bookLoanId;
	}

	public void setBookLoanId(int bookLoanId) {
		this.bookLoanId = bookLoanId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the customer1
	 */
	public Customer getCustomer1() {
		return customer1;
	}
	/**
	 * @param customer1 the customer1 to set
	 */
	public void setCustomer1(Customer customer1) {
		this.customer1 = customer1;
	}
	/**
	 * @return the book1
	 */
	public Book getBook1() {
		return book1;
	}
	/**
	 * @param book1 the book1 to set
	 */
	public void setBook1(Book book1) {
		this.book1 = book1;
	}
   
}
