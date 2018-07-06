package cn.bjsxt.test.car;

import java.util.Scanner;

public class TestAgent {

	public static void main(String[] args) {
		Agent agent = new Agent();
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String type = input.next();
			int n = 0;
			if(type.equals("¼äÐª"))
				n = input.nextInt();
			agent.setSpeed(type, n);
			System.out.println(agent.calculateSpeed());
		}
		input.close();
	}
}
