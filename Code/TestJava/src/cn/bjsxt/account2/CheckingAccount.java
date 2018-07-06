package cn.bjsxt.account2;

public class CheckingAccount extends Account {

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String account, float balances, float rate,
			String openDate) {
		super(account, balances, rate, openDate);
	}

	public void setOver(float over) {
		super.over = over;
		deposit(over);
	}
}
