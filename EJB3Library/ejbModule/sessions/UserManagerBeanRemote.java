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
import javax.ejb.Remote;
import java.util.List;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

@Remote
public interface UserManagerBeanRemote {

	public List getBooks();

	public Boolean isBookAvailable(String ISBN);

	public boolean getBook(String ISBN);

	public List getBooksOnLoan();

	public Boolean borrowBook(int userId, String LSBN);

	public void getBookLoant(Object pk);

	public Boolean returnBook(Object id);
	

}
