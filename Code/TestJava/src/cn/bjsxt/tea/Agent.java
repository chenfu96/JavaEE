package cn.bjsxt.tea;

public class Agent {

	public static void main(String[] args) {
		TeaKind redTea = new RedTea();
		TeaKind greenTea = new GreenTea();
		TeaKind blackTea = new BlackTea();
		TeaSize superTea = new SuperCup();
		add(superTea, redTea, greenTea);
		TeaSize mediumTea = new MediumCup();
		add(mediumTea, redTea, greenTea, blackTea);
		TeaSize smallTea = new SmallCup();
		add(smallTea, redTea, blackTea);
		superTea.test();
		mediumTea.test();
		smallTea.test();
		
	}
	public static void add(TeaSize tea, TeaKind... obj){
		for(TeaKind kind : obj){
			tea.tea.add(kind);
		}
	}
}
