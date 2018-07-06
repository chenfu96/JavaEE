package cn.nchu.javatest;

public class Program2 {

	public static boolean isPrime(int n) {
		for(int i = 2; i * i <= n; ++i)
				if(n % i == 0)	return false;
		return true;
	}
	public static void main(String[] args) {
		int[] a = new int[100];
		int index = 0;
		for(int i = 101; i <= 200; ++i){
			if(isPrime(i)){
				a[index++] = i;
			}
		}
		System.out.println("����������" + index + "���£�");
		for(int i = 0; i < index; ++i)
			System.out.print(a[i] + " ");
	}
}
