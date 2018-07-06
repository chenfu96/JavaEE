package cn.bjsxt.account2;

public class Account {

	protected String account;
	protected float balances;
	protected float rate;
	protected String openDate;
	protected float over = 0;
	public String getAccount() {
		return account;
	}
	
	public double getOver() {
		return over;
	}

	public void setOver(float over) {
		this.over = over;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public float getBalances() {
		return balances;
	}
	public void setBalances(float balances) {
		this.balances = balances;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	} 
	public void deposit(float num){
		setBalances(num + this.balances);
	}
	public void withdrawals(float num){
		setBalances(this.balances - num);
	}
	public Account(String account, float balances, float rate, String openDate) {
		this.account = account;
		this.balances = balances;
		this.rate = rate;
		this.openDate = openDate;
	}
	public Account() {
	}
}
