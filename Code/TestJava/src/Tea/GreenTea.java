package Tea;

public class GreenTea implements Teakind{
	private final double Price = 5;

	public double price(TeaSize teaSize){
		return Price * teaSize.getPrice();
	}
	}
