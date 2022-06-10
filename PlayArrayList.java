import java.util.ArrayList;

public class PlayArrayList {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("I10");
		cars.add("I20");
		
		System.out.println(cars);
		
		cars.add(1,"Porche");
		System.out.println(cars);
		
		for(String car: cars) {
			System.out.println(car);
		}
		
		System.out.println(cars.size());
		
		cars.remove(0);
		System.out.println(cars);
		
		cars.remove("Porche");
		System.out.println(cars);
		
		cars.set(0, "Nano");
		System.out.println(cars);
	
		
		
		
	}

}
