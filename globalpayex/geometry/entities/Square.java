package globalpayex.geometry.entities;
import com.abc.geometry.entities.Shape;

public class Square extends Shape {
	
	int side;
	
	
	public Square(int s) {
		
		this.side = s;
		
	}
	
	public int AreaSquare()
	{
		return (this.side * this.side);
	}
	
	public int PerimeterSquare()
	{
		return (4* this.side);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Square sq = new Square(10);

		System.out.println("Area of Square:" + sq.AreaSquare());
		System.out.println("Area of Square:" + sq.PerimeterSquare());
		
		
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
