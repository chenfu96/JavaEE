package com.chenfu.test;
/**
 * �����ڲ���
 * @author Administrator
 *
 */
public class Demo04 {
	
}

class Outer04{
	
	public void test(){
		
		/*final*/ int a = 3;
		class Inner{
			int b = 10;
//			static int c = 20;//�����ڲ�����ֻ�ܶ���Ǿ�̬��Ա��
			final static  int c = 20;
			void tt(){
//				System.out.println(a);//JDK8�в���finalҲ���Է��ʣ�������֮ǰJDK1.7����
				//�������������ںͷ����ڲ��������������ڲ�һ��,����ִ���꣬�ڲ�����������Ȼ����
				
				System.out.println(b);
			}
		}
	}
}