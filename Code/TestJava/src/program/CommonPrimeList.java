package program;

/**
 * ʱ�䣺O(n*n)
 * �ռ䣺O(n)
 * 
 */


import java.util.Scanner;

public class CommonPrimeList {

	public static boolean isPrime(int n){
		for(int i = 2; i * i <= n; ++i){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num + 1];
		for(int i = 2; i <= num; ++i){
			if(isPrime(i)){
				System.out.print(i + " ");
			}
		}
		input.close();
	}
}
