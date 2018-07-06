package com.bjsxt.facade;

public class Fund {

	private Stock1 stock1 = null;
	private Stock2 stock2 = null;
	private NationalDet nationalDet = null;
	private Realty realty = null;
	public Fund() {
		stock1 = new Stock1();
		stock2 = new Stock2();
		nationalDet = new NationalDet();
		realty = new Realty();
	}
	
	public void buyFund(){
		stock1.buy();
		stock2.buy();
		nationalDet.buy();
		realty.buy();
	}
	
	public void sellFund(){
		stock1.sell();
		stock2.sell();
		nationalDet.sell();
		realty.sell();
	}
	
}
