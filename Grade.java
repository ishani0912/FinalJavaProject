
public class Grade {

	static char grade(int marks) {
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
		int m1 = 40;
		char m= grade(m1); 
		System.out.println(m);
	}
}
