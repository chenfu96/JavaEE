package cn.nchu.javatest;

import java.io.*;
import java.util.*;

public class Program50 {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		String num, name;
		double a, b, c;
		for(int i = 0; i < 3; ++i){
			num = input.next();
			name = input.next();
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			Student stu = new Student(num, name, a, b, c);
			list.add(stu);
		}
		BufferedWriter write = null;
		try {
			FileWriter fw = new FileWriter("E://stud.txt");
			write = new BufferedWriter(fw);
			write.write("No.  " + "Name  " + "average");
			write.newLine();
			for(int i = 0; i < 3; ++i){
				Student stu = list.get(i);
				write.write(stu.getNum() + "    " + stu.getName() + "    " + stu.getAver());
				write.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				write.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		input.close();
	}
}
class Student {
	private String num;
	private String name;
	private double a;
	private double b;
	private double c;
	private double aver;
	public Student(String num, String name, double a, double b, double c) {
		this.num = num;
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.aver = (a + b + c) / 3;
		
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
}
 