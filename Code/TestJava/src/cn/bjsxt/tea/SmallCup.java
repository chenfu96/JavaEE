package cn.bjsxt.tea;

public class SmallCup extends TeaSize {

	public void test() {
		for(TeaKind obj : tea){
			System.out.print("����С����");
			obj.test();
		}
	}
	public SmallCup() {
		super();
	}
}
