package com.bjsxt.state;

/**
 * ������Ԥ��
 * @author Administrator
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("������Ԥ����");
	}

}
