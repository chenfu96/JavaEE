package com.bjst.sortpoint;

import java.util.ArrayList;
import java.util.List;



public class Client {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(2, 1));
		list.add(new Point(1, 1));
		list.add(new Point(3, 1));
		list = new PointSorter().sortPoint(list);
		for(Point point : list){
			System.out.println(point.getX() + ", " + point.getY());
		}
	}
}
