package com.nchu.state;

/**
 * ���繤��״̬
 * @author acer
 *
 */
public class ForenoonState extends State {

	public void writeProgram(Work w) {
		if(w.getHour() < 12){
			System.out.println("��ǰʱ�䣺" + w.getHour() + "�㣬 ���繤��������ٱ���");
		}else{
			w.setState(new NooState());
			w.WriteProgram();
		}
	}
}
