
public class UseNextGenArray {
	
	public static void main(String[] args) {
		String[] cars = {"Porche", "Audi", "BMW", "Mercedes"};
		NextGenArray<String> nextgenarray = new NextGenArray<String>(cars);
		
		System.out.println(nextgenarray.get(2));
		System.out.println(nextgenarray.get(3));
		
		String element1 = nextgenarray.get(1);
		String element2 = nextgenarray.get(3);
				
		nextgenarray.set(1, "Bolero");	
		System.out.println(nextgenarray);
		
		Integer[] nos = {5,6,7,8,9,10};
		NextGenArray<Integer> nextgenarray1 = new NextGenArray<Integer>(nos);
		
		
		
		System.out.println(nextgenarray1.get(1));
		System.out.println(nextgenarray1.get(2));
		
		nextgenarray1.set(2, 80);
		System.out.println(nextgenarray1.get(2));
		
		System.out.println(nextgenarray1.toString());
		
	}

}
