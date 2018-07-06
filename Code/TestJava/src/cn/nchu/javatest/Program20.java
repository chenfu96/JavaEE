package cn.nchu.javatest;

public class Program20 {

	public static void main(String[] args) {
		double sum = 0.0;
		double up = 2; 
		double down = 1;
		double temp = 0.0;
		for(int i = 1; i <= 20; ++i){
			sum += up / down;
			temp = up;
			up += down;
			down = temp;
		}
		System.out.println("the result:" + String.format("%.2f", sum));
	}
}
