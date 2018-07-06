package com.nchu.state;

public class EveningState extends State {

	public void writeProgram(Work w) {
		if(w.isTaskFinished()){
			w.setState(new RestState());
			w.WriteProgram();
		}else{
			if(w.getHour() < 21){
				System.out.println("��ǰʱ��:" + w.getHour() + "�㣬 �Ӱ�Ŷ��ƣ��������");
			}else{
				w.setState(new SleepingState());
				w.WriteProgram();
			}
		}
	}
}
