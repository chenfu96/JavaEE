package cn.nchu.javatest;

public class Program3 {

	public static boolean isDaffodils(int n){
		int bit = n % 10;
		int decade = n / 10 % 10;
		int hundred = n / 100;
		int sum = (int) (Math.pow(bit, 3) + Math.pow(decade, 3) +  Math.pow(hundred, 3));
		if(sum == n){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		for(int i = 100; i < 1000; ++i){
			if(isDaffodils(i)){
				System.out.println(i + " ");
			}
		}
	}
}
