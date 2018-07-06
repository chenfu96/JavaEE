package com.bjsxt.facade;

public interface 工商局 {
	void chckName();
}

class 海鼎区工商局 implements 工商局 {

	@Override
	public void chckName() {
		System.out.println("检查名字是否有冲突！");
	}
	
}
