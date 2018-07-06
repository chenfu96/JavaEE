package Tea;

import java.util.Scanner;

public class TClient {

	public static void main(String[] args) {
		String kind1 = "GREENTEA";
		String kind2 = "REDTEA";
		String kind3 = "BLACKTEA";
		String size1 = "SUPERCUP";
		String size2 = "MEDIUMCUP";
		String size3 = "SMALLCUP";
		
		System.out.println("«Î ‰»Îƒ„œÎπ∫¬Úµƒ≤Ë£∫");
		Scanner input = new Scanner(System.in);
		Teakind ted = null;
		String stk = input.next();
		switch(stk){
		case "GREENTEA": 	ted = new GreenTea(); break;
		case "REDTEA":		ted = new RedTea(); break;
		case "BLACKTEA":	ted = new BlackTea(); break;
		}
		
		System.out.println("«Î ‰»Î±≠µƒ≥ﬂ¥Á");
		TeaSize tee = null;
		String sts = input.next();
		switch(sts){
		case "SMALLCUP":	tee = new SmallCup();	break;
		case "SUPERCUP":	tee = new SuperCup();	break;
		case "MEDIUMCUP":	tee = new MediumCup();	break;
		}
		
		System.out.println(ted.price(tee));
		
		
	}

}
