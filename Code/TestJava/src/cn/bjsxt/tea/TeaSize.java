package cn.bjsxt.tea;

import java.util.ArrayList;

public class TeaSize {

	protected ArrayList<TeaKind> tea = null;
	public void test(){
		System.out.println("我是杯子的大小！");
	}
	public TeaSize() {
		this.tea = new ArrayList<TeaKind>();
	}
	
}
