import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//return o2.compareTo(o1);  //descending order
		return o1.compareTo(o2);    //ascending order
	}
	
	

}
