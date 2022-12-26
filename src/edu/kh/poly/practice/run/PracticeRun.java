package edu.kh.poly.practice.run;

import edu.kh.poly.practice.model.service.QuestionService;

public class PracticeRun {

	public static void main(String[] args) {
		QuestionService	qs = new QuestionService();
		
		qs.displayMenu();
	}

}
