package cn.bjsxt.www;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(JOptionPane.showInputDialog("input a num:"));
		String s = "";
		int q = 2;
		while(q < num){
			if(num % q == 0){
				s += q + ",";
				num /= q;
			}else{
				++q;
			}
		}
		s += q;
		System.out.println(s);
		JOptionPane.showMessageDialog(null, s);
		input.close();
	}
}
