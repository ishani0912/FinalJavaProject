
public class GetDetails {
	
	public static String Details(String name, int roll, int marks,char grade)
	{
		
		String re="";
		re= re + name + ' ' + roll + ' ' + marks + ' ' + grade;
		
		return re;
	}
	
	
	public static char getgrade(int marks)
	{
		char grade;
		if((marks>100) || (marks<0))
		{
			grade = 'I';
		}
		else if(marks>=70) {
			grade='A';
		}
		else if((marks>=60) && (marks<70))
		{
			grade='B';
		}
		else if((marks>=40) && (marks<60))
		{
			grade='C';
		}
		else
		{
			grade='F';
		}
		return grade;
	   }
	
	public static void main(String[] args) {
		
		String name= "Ishani";
		int roll = 12;
		int marks= 30;
		System.out.println(Details(name,roll,marks,getgrade(marks)));
		
	}

}
