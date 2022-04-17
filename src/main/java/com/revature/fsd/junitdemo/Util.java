package com.revature.fsd.junitdemo;

public class Util {
	
	public static boolean isAverageStudent(int score) {
		return score >= 60 && score <= 75;
	}
	
	public static void main(String args[]) {
		boolean averageStudent = isAverageStudent(25);
		if (averageStudent) {
			System.out.println("Expected false, but has returned true");
		} else {
			System.out.println("Success");
		}

		averageStudent = isAverageStudent(60);
		if (averageStudent) {
			System.out.println("Success");
		} else {
			System.out.println("Expected true, but has returned false");
		}
	}

}
