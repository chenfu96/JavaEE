package cn.bjsxt.account;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		
		Account user = new Account();
		
		Scanner input = new Scanner(System.in);
		String account = input.next();
		float balances = input.nextFloat();
		float rate = input.nextFloat();
		String openDate = form.format(new Date()).toString();
		
		user.setAccount(account);
		user.setBalances(balances);
		user.setOpenDate(openDate);
		user.setRate(rate);
		
		System.out.println(user.getAccount() + " " + user.getBalances() + " " + user.getOpenDate() + " " + user.getRate());
		
		float deposit = input.nextFloat();
		user.deposit(deposit);
		System.out.println(user.getBalances());
		
		user.withdrawals(100);
		System.out.println(user.getBalances());
		
		input.close();
	}
}
