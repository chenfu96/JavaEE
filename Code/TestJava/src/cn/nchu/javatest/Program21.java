package cn.nchu.javatest;


public class Program21 {

	public static void main(String[] args) {
		long sum = 0;
		long temp = 1;
		for(int i = 1; i <= 20; ++i){
			temp *= i;
			sum += temp;
		}
		System.out.println("the result : " + sum);
	}
}
