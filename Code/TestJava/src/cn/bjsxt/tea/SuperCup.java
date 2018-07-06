package cn.bjsxt.tea;


public class SuperCup extends TeaSize {

	public void test() {
		for(TeaKind obj : tea){
			System.out.print("我是大杯的");
			obj.test();
		}
	}

	public SuperCup() {
		super();
	}
}
