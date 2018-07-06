package com.nchu.state;

public class EveningState extends State {

	public void writeProgram(Work w) {
		if(w.isTaskFinished()){
			w.setState(new RestState());
			w.WriteProgram();
		}else{
			if(w.getHour() < 21){
				System.out.println("当前时间:" + w.getHour() + "点， 加班哦，疲惫至极！");
			}else{
				w.setState(new SleepingState());
				w.WriteProgram();
			}
		}
	}
}
