
public class Evennumbers {
	
	static String EvenNumbers(int n)
	{
		int i=0;
		String result = "";
	
		while(i<=n)
		{
			if(i%2==0)
			{
				result= result + i;
				
				if(i != n) {
					result = result + ',';
				}
				
			}
			i++;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n = 40;
		System.out.println(EvenNumbers(n));
		}

}
