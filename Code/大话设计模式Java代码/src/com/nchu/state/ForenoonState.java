package com.nchu.state;

/**
 * 上午工作状态
 * @author acer
 *
 */
public class ForenoonState extends State {

	public void writeProgram(Work w) {
		if(w.getHour() < 12){
			System.out.println("当前时间：" + w.getHour() + "点， 上午工作，精神百倍！");
		}else{
			w.setState(new NooState());
			w.WriteProgram();
		}
	}
}
