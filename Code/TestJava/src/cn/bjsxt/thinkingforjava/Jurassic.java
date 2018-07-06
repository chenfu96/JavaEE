package cn.bjsxt.thinkingforjava;

public class Jurassic {

	public static void main(String[] args) {
		SmallBrain n = new SmallBrain();
		SmallBrain.n.i = 40;
		System.out.println(SmallBrain.n.i);
	}
}
class SmallBrain {
	static final Dinosaur n = new Dinosaur();
}

class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f(){
	}
}
