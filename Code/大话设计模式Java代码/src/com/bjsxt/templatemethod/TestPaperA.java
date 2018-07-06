package com.bjsxt.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestPaperA extends TestPaper {

	public String Answer1() {
		return "A";
	}

	public String Answer2() {
		return "B";
	}

	public String Answer3() {
		return "C";
	}

	public boolean wantSolve() {
		if("y".equals(getStudentInput().toLowerCase()))
			return true;
		return false;
	}
	public String getStudentInput(){
		String result = null;
		System.out.println("would you want to solve the question? please input y or n");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			result = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(result == null)	result = "n";
		return result;
	}
}
