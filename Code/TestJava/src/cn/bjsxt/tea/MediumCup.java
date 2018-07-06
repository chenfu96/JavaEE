package cn.bjsxt.tea;

public class MediumCup extends TeaSize {

	public void test() {
		for(TeaKind obj : tea){
			System.out.print("我是中杯的");
			obj.test();
		}
	}

	public MediumCup() {
		super();
	}
}
