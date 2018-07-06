package Tea;

public class RedTea implements Teakind{
	private final double Price = 3;
	public double price(TeaSize teaSize){
		return Price * teaSize.getPrice();
	}
	

	
}