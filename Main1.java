package Snorlax054;

public class Main1 {

	public static void main(String[] args) {
		Rectangle x = new Rectangle(4, 6);
		Rectangle y = new Rectangle(9, 11);
		x.draw();
		y.draw();
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println();
		x.Scale(2);
		x.draw();
		System.out.println(x.toString());
	}

}
