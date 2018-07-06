package cn.nchu.javatest;

public class Program22 {

	public static int fact(int n){
		if(n == 1)	return 1;
		return fact(n - 1) * n;
	}
	public static void main(String[] args) {
		System.out.println("5! is " + fact(5));
	}
}
