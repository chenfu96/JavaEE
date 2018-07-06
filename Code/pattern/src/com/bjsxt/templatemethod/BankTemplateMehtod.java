package com.bjsxt.templatemethod;

public abstract class BankTemplateMehtod {
	
	//具体方法
	public void takeNumber() {
		System.out.println("取号排队");
	}
	
	public abstract void transact();//办理具体业务，钩子方法
	
	public void evaluate() {
		System.out.println("反馈评分");
	}
	/**
	 * 1.之所以要使用final方法，可能是出于对两方面理由的考虑。
		 * 第一个是为方法“上锁”，防止任何继承类改变它的本来含义。
		 * 设计程序时，若希望一个方法的行为在继承期间保持不变，而且不可被覆盖或改写，
		 * 就可以采取这种做法。
	 * 2.采用final方法的第二个理由是程序执行的效率。将一个方法设成final后，
		 * 编译器就可以把对那个方法的所有调用都置入“嵌入”调用里。只要编译器发现一个final方法调用
		 * ，就会（根据它自己的判断）忽略为执行方法调用机制而采取的常规代码插入方法（将自变量压入堆栈；
		 * 跳至方法代码并执行它；跳回来；清除堆栈自变量；最后对返回值进行处理）。
		 * 相反，它会用方法主体内实际代码的一个副本来替换方法调用。这样做可避免方法调用时的系统开销。
		 * 当然，若方法体积太大，那么程序也会变得雍肿，可能受到到不到嵌入代码所带来的任何性能提升。
		 * 因为任何提升都被花在方法内部的时间抵消了。Java编译器能自动侦测这些情况，
		 * 并颇为“明智”地决定是否嵌入一个final方法。然而，最好还是不要完全相信编译器能正确地作出所有判断。
		 * 通常，只有在方法的代码量非常少，或者想明确禁止方法被覆盖的时候，才应考虑将一个方法设为final。
	 */
	public final void process() {
		this.takeNumber();
		this.transact();//像个钩子，执行时，挂哪个子类，就执行那个子类
		this.evaluate();
	}
}
