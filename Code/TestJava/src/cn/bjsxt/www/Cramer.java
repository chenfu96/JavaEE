package cn.bjsxt.www;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cramer {

	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3, x4, y4;
		Scanner input = new Scanner(System.in);
		System.out.print("Ente x1, y1, x2, y2, x3, y3, x4, y4:");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		double k1 = (y1 - y2) / (x1 - x2);
		double k2 = (y3 - y4) / (x3 - x4);
		if(k1 == k2){
			System.err.println("The two lines are parallel");
		}else{
			double x = (y3 - y1 + k1 * x1 - k2 * x3) / (k1 - k2);
			double y = k1 * (x - x1) + y1;
			DecimalFormat formal = new DecimalFormat("#.00000");
			System.out.println("The intersecting point at (" + formal.format(x) + "," + formal.format(y) + ")");
		}
		input.close();
	}
}
