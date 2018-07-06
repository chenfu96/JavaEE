package program;

/**
 * 时间复杂度：O(n)
 * 空间复杂度：O(n)
 */

import java.util.Scanner;

public class ProgramPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num + 1];
		for(int i = 2; i * i <= num; ++i){
			if(a[i] == 0){
				for(int j = 0; i * i + i * j <= num; ++j){
					a[i * i + i * j] = 1;
				}
			}
		}
		for(int i = 2; i <= num; ++i){
			if(a[i] == 0){
				System.out.print(i + " ");
			}
		}
		input.close();
	}
}