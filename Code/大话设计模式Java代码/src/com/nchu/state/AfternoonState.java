package com.nchu.state;

public class AfternoonState extends State {

	public void writeProgram(Work w) {
		if(w.getHour() < 17){
			System.out.println("��ǰʱ�䣺" + w.getHour() + "�㣬����״̬����������Ŭ����");
		}else{
			w.setState(new EveningState());
			w.WriteProgram();
		}
	}
}
