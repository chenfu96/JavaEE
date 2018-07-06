package com.bjsxt.facade;

public interface 税务局 {
	void taxCertificate();
}

class 海鼎区税务局 implements 税务局 {

	@Override
	public void taxCertificate() {
		System.out.println("在海鼎区税务局办理税务登记证！");
	}
	
}
