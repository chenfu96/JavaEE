package cn.bjsxt.tea;

public class MediumCup extends TeaSize {

	public void test() {
		for(TeaKind obj : tea){
			System.out.print("�����б���");
			obj.test();
		}
	}

	public MediumCup() {
		super();
	}
}
