package com.nchu.state;

public class NooState extends State{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13){
			System.out.println("��ǰʱ�䣬" + w.getHour() + "�㣬 ���ˣ� �緹�������� ���ݣ�");
		}else{
			w.setState(new AfternoonState());
			w.WriteProgram();
		}
	}
}
