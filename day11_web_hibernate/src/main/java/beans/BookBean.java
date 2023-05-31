package beans;

import java.time.LocalDate;

import dao.BookDaoImpl;
import pojos.Book;

public class BookBean {
//props
	private String email;
	private String title;
	private String pubDate;
	// add dao ref
	private BookDaoImpl bookDao;
	// add status mesg
	private String message;

	// def ctor
	public BookBean() {
		// create book dao instance
		bookDao = new BookDaoImpl();
		System.out.println("book bean created....");
	}

	// setters n getters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public BookDaoImpl getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDaoImpl bookDao) {
		this.bookDao = bookDao;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// add a B.L method , to add Book
	public String addBook() {
		// validate the pob date
		// parsing
		LocalDate date = LocalDate.parse(pubDate);
		LocalDate today = LocalDate.now();
		LocalDate yrBegin = LocalDate.of(today.getYear(), 1, 1);
		LocalDate endYr = LocalDate.of(today.getYear(), 12, 31);
		if (date.isBefore(yrBegin) || date.isAfter(endYr)) {
			// => validation err
			message = "Invalid pub date , Book can't be added";
		} else // => valid details
			message = bookDao.addNewBook(email, new Book(title));
		return "status";// name of the page for the navigation.
	}
}
