package cn.bjsxt.tea;


public class SuperCup extends TeaSize {

	public void test() {
		for(TeaKind obj : tea){
			System.out.print("���Ǵ󱭵�");
			obj.test();
		}
	}

	public SuperCup() {
		super();
	}
}
