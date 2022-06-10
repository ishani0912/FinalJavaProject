import com.globalpayex.college.entities.StudentOld;

public class createStudents {
	
	public static void main(String[] args) {
		System.out.println(StudentOld.count);
		//Student s1 = new Student();
		//Student s2 = new Student();
				
	/*	System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.roll);
		System.out.println(s1.marks); */
		
	/*	s1.name= "Ishani";
		s1.roll = 12;
		s1.gender= 'f';
		s1.marks = 50; */
		
		StudentOld s1 = new StudentOld("jane",'f', 15, 88);
		System.out.println(StudentOld.count);
		StudentOld s2 = new StudentOld();
		System.out.println(StudentOld.count);
		
		
	/*	System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.roll);
		System.out.println(s1.marks); */
		
		//System.out.println(s1.getDetails());
		//System.out.println(s1.getgrade());
		//System.out.println(s2.getDetails());
		
		StudentOld s4 = StudentOld.newInstance("ishani",'f', 15,55);	
		System.out.println(s4.getDetails());
		
		
	}

}
