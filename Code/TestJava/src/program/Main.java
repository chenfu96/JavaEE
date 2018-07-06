
package program;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigDecimal num = new BigDecimal("1");
		int n = input.nextInt();
		for(int i = 1; i <= n; ++i){
			num = num.multiply(BigDecimal.valueOf(i));
		}
		String s = num.stripTrailingZeros().toPlainString(); 
		for(int i = 0; i < s.length(); ++i){
			if(i % 1000 == 0 && i != 0)	System.out.println();
			System.out.print(s.charAt(i));
		}
	}
}

