package com.bjsxt.observer;

public class Client {

	public static void main(String[] args) {
		
		//创建目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		
		//创建多个观察者
		
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();

		//让这三个观察者添加到suject对象中
		
		subject.register(obs1);
		subject.register(obs2);
		subject.register(obs3);
		//改变状态前
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//现在改变subject状态
		
		subject.setState(200);
		/**
		 * 多态==晚绑定。

		　　	不要把函数重载理解为多态。
		
		　　	因为多态是一种运行期的行为，不是编译期的行为。
		
		　　	多态：父类型的引用可以指向子类型的对象。
		
		　　	比如 Parent p = new Child();
		
		　　	当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；
	
	　　　　	如果有，再去调用子类的该同名方法。
	
			（注意此处，静态static方法属于特殊情况，静态方法只能继承，不能重写Override，如果子类中定义了同名同形式的静态方法，它对父类方法只起到隐藏的作用。调用的时候用谁的引用，则调用谁的版本。）

　　			（参考学习链接：http://docs.oracle.com/javase/tutorial/java/IandI/override.html）　　

　　			如果想要调用子类中有而父类中没有的方法，需要进行强制类型转换，如上面的例子中，将p转换为子类Child类型的引用。

　　			因为当用父类的引用指向子类的对象，用父类引用调用方法时，找不到父类中不存在的方法。这时候需要进行向下的类型转换，将父类引用转换为子类引用。 
		 */
		//观察者的状态是不是发生改变
//		Observer obs1 = new ObserverA();
//		System.out.println(((ObserverA)obs1).getMyState());
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
