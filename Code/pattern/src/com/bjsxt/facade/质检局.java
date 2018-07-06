package com.bjsxt.facade;

public interface 质检局 {
	void orgCodeCertificate();
}

class 海鼎区质检局 implements 质检局 {

	@Override
	public void orgCodeCertificate() {
		System.out.println("在海鼎区质检局办理组织机构代码证！");
	}
	
}
