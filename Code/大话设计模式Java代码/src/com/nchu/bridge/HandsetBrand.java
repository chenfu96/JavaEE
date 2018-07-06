package com.nchu.bridge;

abstract class HandsetBrand {

	protected HandsetSoft handsetSoft = null;
	
	public void setHandsetSoft(HandsetSoft soft){
		handsetSoft = soft;
	}
	
	public abstract void run();
}
