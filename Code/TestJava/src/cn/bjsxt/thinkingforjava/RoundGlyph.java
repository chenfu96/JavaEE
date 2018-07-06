package cn.bjsxt.thinkingforjava;

public class RoundGlyph extends Glyph {

	private int radius = 1;
	public RoundGlyph(){
		
	}
	public RoundGlyph(int r) {
		super(r);
		this.radius = r;
		System.out.println("RoundGlyph.RoundGlyph, radius = " + radius);
	}
	public void draw(){
		System.out.println("RoundGlyph.draw, radius = " + radius);
	}
	public static void main(String[] args) {
		new RoundGlyph(5);
		Glyph.main(new int[]{2, 1});
	}
}
class Glyph{
	public void draw(){
		System.out.println("Glyph.draw");
	}
	public Glyph(int r) {
		System.out.println("before");
		draw(); 
		System.out.println("afer!");
	}
	public Glyph(){
		
	}
	public static void main(int[] args) {
		for(int a : args)
			System.out.println(a);
	}
}

