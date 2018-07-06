package com.bjsxt.prototype;

/**
 * new产生一个对象很耗时间，我们可以采用原型模型
 * @author Administrator
 *
 */
public class Client4 {

	public static void testNew(int size){
		long start = System.currentTimeMillis();
		for(int i = 0; i < size; i ++){
			Laptop t = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new的方式耗时:"+(end-start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException{
		long start = System.currentTimeMillis();
		Laptop t = new Laptop();
		for(int i = 0; i < size; i ++){
			Laptop temp = (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("Clone的方式耗时:"+(end-start));
	}
	public static void main(String[] args) throws Exception {
		testNew(1000);
		testClone(1000);
	}
}

class Laptop implements Cloneable{
	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//模拟创建对象时的耗时！
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用obje对象的clone方法
		return obj;
	}
}
