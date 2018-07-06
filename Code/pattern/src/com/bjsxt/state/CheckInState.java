package com.bjsxt.state;

/**
 * 房间有人住
 * @author Administrator
 *
 */
public class CheckInState implements State {

	@Override
	public void handle() {
		System.out.println("房间有人住！");
	}

}
