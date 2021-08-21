package ch18;

import java.util.Calendar;

public class Company {

	private static Company instance = new Company();

	private Company() {

	}

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
