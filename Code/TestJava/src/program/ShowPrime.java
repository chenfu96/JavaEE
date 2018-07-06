package program;
import java.util.Scanner;

public class ShowPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int num = input.nextInt();
			showPrime(num);
		}
		input.close();
	}
	
	public static void showPrime(int num){
		int[] prime = new int[num + 1];
		for(int i = 2; i * i <= num; ++i)
			for(int j = 2; j * i <= num; ++j)
					prime[i * j] = 1;
		int cnt = 0;
		for(int i = 2; i <= num; ++i){
			if(prime[i] == 0){
				++cnt;
				System.out.print(i + (cnt == 4 ? "\n" : " "));
				if(cnt == 4)	cnt = 0;
			}
		}
	}
}
