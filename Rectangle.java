public class Rectangle {
	
	static int perimeterRectangle(int length, int breadth) {
		return 2*(length + breadth);
		
	}

	public static void main(String[] args)
	{
		int l1= 8;
		int b1 = 4;
//		var a=1;
		int p1= perimeterRectangle(l1,b1);
		System.out.println(p1);
	}
}


