package Snorlax054;

public class Rectangle {
	private int length;
	private int width;
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public int getLength() 
	{
		return length;
	}
	public void setLength(int length) 
	{
		this.length = length;
	}
	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}
	public void draw()
	{
		for(int i=0;i<this.width;i++)
		{
			for(int j=0;j<this.length;j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
		System.out.println();
	}
	public int calcArea()
	{
		int a = this.length*this.width;
		return a;
	}
	public int calcPerimeter()
	{
		int p = 2*(this.length+this.width);
		return p;
	}
	public void Scale(int factor)
	{
		this.length = this.length*factor;
		this.width = this.width*factor;
	}
	public String toString()
	{
		String x = "Length: "+this.length+" Width: "+this.width+" Area: "+this.calcArea()+" Perimeter: "+this.calcPerimeter();
		return x;
	}
	
}
