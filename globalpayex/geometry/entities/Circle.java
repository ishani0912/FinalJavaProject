package globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Circle extends Shape {
	
	int radius;
	
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int)(Math.PI * Math.pow(radius, 2));
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int)(2*Math.PI*radius);
	}

}
