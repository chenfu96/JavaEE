package cn.bjsxt.tea;

public class SmallCup extends TeaSize {

	public void test() {
		for(TeaKind obj : tea){
			System.out.print("我是小杯的");
			obj.test();
		}
	}
	public SmallCup() {
		super();
	}
}
