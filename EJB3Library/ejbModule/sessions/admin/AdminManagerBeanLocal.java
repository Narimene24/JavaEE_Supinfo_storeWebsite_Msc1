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
package sessions.admin;
import java.sql.Date;
import java.util.List;

import javax.ejb.Local;

@Local
public interface AdminManagerBeanLocal {

	public List getAuthors();

	public Boolean isBookAvailable(String ISBN);

	public void getAuthor(int authodId);

	public List getBooks();

	public List getCustomers();

	public List getBooksOnLoan();

	public void getBook(String ISBN);

	public void getCustomer(int customerId);

	public Boolean createNewAuthor(int authorId, String authorFirstName,
			String authorLastName);

	public Boolean createNewBook(String ISBN, Date publishingDate, int authorId);

	public void createNewUser(int userId, String userFName, String userLName,
			String address, String email, String phone);

}
