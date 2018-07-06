package com.bjsxt.facade;

public interface 银行 {
	void openAccout();
}

class 海鼎区银行 implements 银行 {

	@Override
	public void openAccout() {
		System.out.println("在海鼎区银行开户！");
	}
	
}

