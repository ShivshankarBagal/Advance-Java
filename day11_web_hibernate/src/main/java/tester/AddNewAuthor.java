package tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.*;

import dao.AuthorDaoImpl;
import pojos.Author;

public class AddNewAuthor {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			// create dao instance
			AuthorDaoImpl authDao = new AuthorDaoImpl();
			System.out.println(
					"Enter Author details : Name, email");
			Author authDao1=new Author(sc.next(),sc.next());
			System.out.println(authDao.addAuthorWithBooks(authDao1));
		} // sf.close , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
