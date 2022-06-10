import com.globalpayex.college.entities.Student;
import com.abc.salary.SalariedIndividual;
import com.abc.salary.SalaryCalculator;
import com.globalpayex.college.entities.Professor;


public class RunCollege {
	
	
	public static void main(String[] args) {
		
		int i=20; 
		
		Student s = new Student("Ishani", 'f', 12, 100);
		
		String[] subjects = {"Physics", "chemistry"};
		Professor p = new Professor("Jane", 'f', subjects, 5000, 20);
		System.out.println(SalaryCalculator.calculate(p));
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(p);
		
		System.out.println(p.calculate());
		//internally: 
		//SOP statement-> reference calls toString(), System.out.println(Student.toString(s));
		
	/*	System.out.println(s.name);
		System.out.println(s.gender);
		
		System.out.println(p.name);
		System.out.println(p.gender);
//		System.out.println(p.subjects); */
		
		//System.out.println(s.getDetails());
		//internally: in Student class, getDetails() 
		//System.out.println(p.getDetails());
		//internally: in Professor class, getDetails()
				
				
	}

}
