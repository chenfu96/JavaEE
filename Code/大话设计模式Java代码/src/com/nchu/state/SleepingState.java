package com.nchu.state;

public class SleepingState extends State{

	public void writeProgram(Work w) {
		System.out.println("��ǰʱ�䣺" + w.getHour() + "�㣬˯���š�");
	}
}
