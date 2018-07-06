package com.nchu.state;

public class Work {

	private State state;

	public Work() {
		state = new ForenoonState();
	}
	
	private double hour;

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}
	
	private boolean taskFinished;

	public boolean isTaskFinished() {
		return taskFinished;
	}

	public void setTaskFinished(boolean taskFinished) {
		this.taskFinished = taskFinished;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void WriteProgram(){
		state.writeProgram(this);
	}
}
