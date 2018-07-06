package cn.bjsxt.www;
import java.util.*;

public class The_digits_of_num {
		public static int main(String[] args) {
			int num;
			Scanner cin = new Scanner(System.in);
			
			while(cin.hasNext()) {
				num = cin.nextInt();
				int[] digit = new int [10];
				for(int i=0;i<10;++i) {
					digit[i]=0;
				}
				int len=0;
				while(num != 0) {
					digit[len++]=num%10;
					num=num/10;
				}
				
				for(int i=len-1;i>=0;--i) {
					System.out.print(digit[i]);
				}
				System.out.println();
			}
			return 0;
		}
}
