package com.bjsxt.state;

public class Client {

	public static void main(String[] args) {
		Context ctx = new Context();
		
		
		ctx.SetState(new FreeState());
	}
}
