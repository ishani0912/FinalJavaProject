package globalpayex.geometry.entities;
import com.abc.geometry.entities.Shape;

//developer Y

public class Rectangle extends Shape {
	
	int length, breadth;
	
	
	public Rectangle(int l, int b){
		
		this.length = l;
		this.breadth = b;
		
		
	}
	
	public int AreaRect()
	{
		return (this.length * this.breadth);
	}
	
	public int PerimeterRect()
	{
		return 2*(this.length + this.breadth);
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
