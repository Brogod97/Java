package edu.kh.io.practice.run;

import edu.kh.io.practice.model.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		BookService bs = new BookService();
		
		bs.displayMenu();
	}

}
