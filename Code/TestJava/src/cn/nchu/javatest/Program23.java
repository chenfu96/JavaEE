package cn.nchu.javatest;

public class Program23 {

	public static int getAge(int n){
		if(n == 1){
			return 10;
		}
		return getAge(n - 1) + 2;
	}
	public static void main(String[] args) {
		System.out.println("第五个人" + getAge(5) + "岁");
	}
}
