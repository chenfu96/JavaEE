package cn.bjsxt.geometricobject;

public class Agent {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5, "À¶É«");
		System.out.println(triangle.toString());
		Triangle triangle1 = new Triangle(3, 4, 5, "À¶É«");
		System.out.println(triangle.equals(triangle1));
	}
}
