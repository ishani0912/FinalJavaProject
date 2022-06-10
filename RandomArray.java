import java.util.Random;

public class RandomArray {
	
	//generic methods only works with reference data types
/*	static <t> t randomElement(t[] elements) {
		Random random = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
		
	} */
	//bounding a generic method to a specific type
	static <t extends Number> t randomElement(t[] elements) {
		Random random = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
		
	}
	
	public static void main(String[] args) {
	/*	String[] cars = {"Porche", "Audi", "BMW", "Mercedes"};
		String element = randomElement(cars);
		System.out.println(element); */
		
		//for using generic methods with primitive data types, wrapper class is to be used
		Integer[] n = {1,2,3,4,5,6,7};
		int number = randomElement(n);
		System.out.println(number);
	}

}
