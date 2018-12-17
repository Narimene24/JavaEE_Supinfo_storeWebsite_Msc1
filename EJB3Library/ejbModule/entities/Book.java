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

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity

public class Book implements Serializable {

	
	private String isbn;
	private String title;
	private Date publishingDate;
	private int authorId;   
	@Id
	private int bookId;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Author author;
	public Book() {
		super();
	}   
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public Date getPublishingDate() {
		return this.publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}   
	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}   
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
   
}
