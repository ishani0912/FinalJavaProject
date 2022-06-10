import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListAgain {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(3);
		arrayList.add(14);
		arrayList.add(50);
		arrayList.add(30);
		
		//sorting in descending order
		arrayList.sort(new DescendingComparator());
		System.out.println(arrayList);
		
		//inner class:
		class DescendingComparator2 implements Comparator<Integer>{
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		}
		//anonymous inner class:
		arrayList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		
		//lambda expression: of passing a function to a function
		arrayList.sort((o1,o2) -> o2.compareTo(o1));			
		
		System.out.println(arrayList);		
		
	}
	
}
