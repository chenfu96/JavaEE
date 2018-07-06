package cn.bjsxt.geometricobject;

public class Triangle implements Comparable, GeometricObject {

	private double a;
	private double b;
	private double c;
	private String color;
	private double triangleArea;
	private double trianglePerimeter;
	public String getColor() {
		return color;
	}
	@Override
	public int compareTo(Object o) {
		Triangle a = (Triangle)o;
		if(this.area() > a.area())	return 1;
		if(this.area() == a.area())	return 0;
		return -1;
	}
	@Override
	public boolean equals(Object obj) {
		Triangle a = (Triangle)obj;
		if(a.area() == this.area())	return true;
		return false;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double perimeter() {
		this.trianglePerimeter = a + b + c;
		return this.trianglePerimeter;
	}
	public double area() {
		this.triangleArea = Math.sqrt((Math.pow(a, 2) * Math.pow(c, 2) - Math.pow((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)), 2) / 4) / 4);
		return this.triangleArea;
	}

	public String toString() {
			return "颜色: " + color + " 三条边: a = " + a + " b = " + b + " c = " + c + " " + "周长：" + trianglePerimeter + "面积：" + triangleArea;
	}

	public Triangle(double a, double b, double c, String color) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
		area();
		perimeter();
	}

	public Triangle() {
	}
}
