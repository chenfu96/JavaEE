package com.bjst.sortpoint;

public class Point implements Comparable<Point>{

	public int compareTo(Point o) {
		if(this.r > o.r)	return 1;
		if(this.r == o.r)	return 0;
		return -1;
	}
	private double x;
	private double y;
	private double r;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		this.r = x * x + y ;
	}
	public Point() {
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
