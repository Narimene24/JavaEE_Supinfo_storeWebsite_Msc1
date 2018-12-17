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

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AdminManagerBean
 */
@Stateless
public class AdminManagerBean implements AdminManagerBeanLocal {

    /**
     * Default constructor. 
     */
    public AdminManagerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean createNewAuthor(int authorId, String authorFirstName,
			String authorLastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createNewBook(String ISBN, Date publishingDate, int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createNewUser(int userId, String userFName, String userLName,
			String address, String email, String phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAuthor(int authodId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getBook(String ISBN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getBooksOnLoan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCustomer(int customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isBookAvailable(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

}
