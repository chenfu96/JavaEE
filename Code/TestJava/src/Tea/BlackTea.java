package Tea;

public class BlackTea implements Teakind{
	private final double Price = 7;
	public double price(TeaSize teaSize){
		return Price * teaSize.getPrice();
	}
}
