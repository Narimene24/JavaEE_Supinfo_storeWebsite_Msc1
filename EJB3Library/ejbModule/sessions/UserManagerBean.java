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
package sessions;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;

/**
 * Session Bean implementation class UserManagerBean
 */
@Stateful
public class UserManagerBean implements UserManagerBeanRemote {

    private EntityManager entityManager;

	/**
     * Default constructor. 
     */
    public UserManagerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean borrowBook(int userId, String LSBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getBook(String ISBN) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getBookLoant(Object pk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getBooksOnLoan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isBookAvailable(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean returnBook(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
