package program;

import java.util.Scanner;
/**
 * ʱ�䣺O(n*n)
 * �ռ䣺O(n)
 * @author acer
 *
 */
public class Program2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num + 1];
		for(int i = 2; i <= num; ++i){
			if(a[i] == 0){
				for(int j = i + i; j <= num; j += i){
					a[j] = 1;
				}
			}
		}
		for(int i = 2; i <= num; ++i){
			if(a[i] == 0){
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		long end = System.currentTimeMillis();
		System.out.println("ʱ�䣺" + (end - start));
		input.close();
	}
}
