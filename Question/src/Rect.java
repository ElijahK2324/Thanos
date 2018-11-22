
public class Rect 
{
	// variables init 
	private int length;
	private int width;
	private int x;
	private int y;
	
	// constructor
	public Rect(int x, int y, int length, int width)
	{
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}
	
	public String toString()
	{
		return "x: " + x + " y: " + y + " l: " + length + " w: " + width;
	}

}
