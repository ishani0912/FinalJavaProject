import com.abc.geometry.shapeStats;

import globalpayex.geometry.entities.Square;
import globalpayex.geometry.entities.Circle;
import globalpayex.geometry.entities.Rectangle;

//manager
public class RunGeometry {
	public static void main(String[] args) {
		
		Square square = new Square(6);	
		shapeStats.smartprint(square);
		
		Rectangle rectangle = new Rectangle(8,9);
		shapeStats.smartprint(rectangle);
		
		shapeStats.smartprint(new Circle(10));
	}
	
	//new Shape(); : error.
	// Shape s;  variable creation is possible with abstract class

}
