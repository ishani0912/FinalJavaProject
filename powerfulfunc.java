
public class powerfulfunc {
	
	static int nextGen(int... number) {					//function that can take n no.of arguments
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum+=number[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(nextGen(5));
		System.out.println(nextGen(5,6,4));
		
		
	}

}
