package com.bjsxt.facade;

public class Client1 {

	public static void main(String[] args) {
		工商局 a = new 海鼎区工商局();
		a.chckName();
		质检局 b = new 海鼎区质检局();
		b.orgCodeCertificate();
		税务局 c = new 海鼎区税务局();
		c.taxCertificate();
		银行 d = new 海鼎区银行();
		d.openAccout();
	}
}
