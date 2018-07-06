package com.bjsxt.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ִ�������ģʽ��Ч��
 * @author Administrator
 *
 */

public class Client3 {

	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i = 0; i < threadNum; i++){
			new Thread(new Runnable() {	
				@Override
				public void run() {
					
					for(int i = 0; i < 10000000; i ++){
						Object o = SingletonDemo04.getInstance();
//						Object o = SingletonDemo05.INSTANCE;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();//main�߳�������ֱ��������Ϊ0���ż�������ִ�С�
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
	}
}
