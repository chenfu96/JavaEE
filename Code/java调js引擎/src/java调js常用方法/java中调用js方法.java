package java��js���÷���;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class java�е���js���� {
	static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");  
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s;
		s = cin.next();
		try {
			System.out.println(jse.eval(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
