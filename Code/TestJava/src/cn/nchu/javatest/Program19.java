package cn.nchu.javatest;


public class Program19 {

	public static void main(String[] args) {
		int n = 4; 
		for(int i = 0; i < n; ++i){
			for(int j = 3 - i; j > 0; --j){
				System.out.print(" ");
			}
			for(int k = 0; k <= 2 * i; ++k){
				System.out.print("*");
			}
			System.out.println();
		}
		n = 3;
		for(int i = n; i > 0; --i){
			for(int j = 3 - i + 1; j > 0; --j){
				System.out.print(" ");
			}
			for(int k = 0; k <= 2 * i - 2; ++k){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
