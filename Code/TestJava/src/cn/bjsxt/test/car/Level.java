package cn.bjsxt.test.car;

public class Level {

	private int position = 0;

	public int getPosition() {
		return position;
	}
	public void dialPosUp(){
		this.position += 1;
	}
	public void dialPosDown(){
		this.position -= 1;
	}
	public Level(int position) {
		this.position = position;
	}
	public Level() {
	}
	
}
