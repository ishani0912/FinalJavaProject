package com.abc.geometry;
import com.abc.geometry.entities.Shape;

import globalpayex.geometry.entities.Rectangle;
import globalpayex.geometry.entities.Square;

public class shapeStats {
	
	public static void smartprint(Shape shape) {
		
		System.out.println("****************Statistics*******************");
		System.out.println(String.format("Area:%s\nPerimeter:%s\n", shape.area(), shape.perimeter()));
		System.out.println("*********************************************");
		
		
	}

}
