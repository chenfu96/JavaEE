package cn.bjsxt.test.car;

public class Agent {

	private Dial dial = new Dial(0);
	private Brush brush = new Brush(0);
	private Level level = new Level(0);
	
	public Agent() {
	}
	
	private void setLevelSpeed(int speed){
		while(level.getPosition() < speed){
			level.dialPosUp();
		}
		while(level.getPosition() > speed){
			level.dialPosDown();;
		}
	}
	private void setDialSpeed(int speed){
		while(dial.getPosition() < speed){
			dial.dialPosUp();
		}
		while(dial.getPosition() > speed){
			dial.dialPosDown();;
		}
	}
	public void setSpeed(String levelSpeed, int brushSpeed){
		if(levelSpeed.equals("Í£Ö¹")) {
			setLevelSpeed(0);
		}else if(levelSpeed.equals("¼äÐª")){
			setLevelSpeed(1);
		}else if(levelSpeed.equals("µÍËÙ")){
			setLevelSpeed(2);
		}else{
			setLevelSpeed(3);
		}
		setDialSpeed(brushSpeed);
		SetWiperSpeed();
	}
	public void setSpeed(String levelSpeed){
		if(levelSpeed.equals("Í£Ö¹")) {
			setLevelSpeed(0);
		}else if(levelSpeed.equals("¼äÐª")){
			setLevelSpeed(1);
		}else if(levelSpeed.equals("µÍËÙ")){
			setLevelSpeed(2);
		}else{
			setLevelSpeed(3);
		}
		SetWiperSpeed();
	}
	public void setSpeed(int brushSpeed){
		setDialSpeed(brushSpeed);
		SetWiperSpeed();
	}
	private void SetWiperSpeed(){
		if(level.getPosition() == 0){
			brush.setBlush(0);
		}else if(level.getPosition() == 1 && dial.getPosition() == 1){
			brush.setBlush(4);
		}else if(level.getPosition() == 1 && dial.getPosition() == 2){
			brush.setBlush(6);
		}else if(level.getPosition() == 1 && dial.getPosition() == 3){
			brush.setBlush(12);
		}else if(level.getPosition() == 2){
			brush.setBlush(30);
		}else if(level.getPosition() == 3){
			brush.setBlush(60);
		}
	}
	public int calculateSpeed(){
		return brush.getBlush();
	}
}
