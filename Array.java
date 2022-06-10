
public class Array {
	public static void main(String[] args) {
		//array creation: size to be declared. Array Size cannot be modified.
		String[] cars = new String[4];
		
		//array creation where elements are known
		String[] fruits = {"mango","apple","peach"};
		
		System.out.println(fruits[1]);
		System.out.println(cars[3]);
		
		//updating an element.
		fruits[1]= "banana";
		System.out.println(fruits[1]);
		
		System.out.println(fruits.length);
		
		//for loop iteration
		for(int i=0; i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
		
	}

}
