import com.globalpayex.college.entities.StudentOld;

public class StudentObject {
	
	public static void main(String[] args) {
		StudentOld[] s = new StudentOld[3];
		
		s[0] = new StudentOld("Meet",'M',10,45);
		s[1] = new StudentOld("Ishani ",'F',11,55);
		s[2] = new StudentOld("Reena",'F',12,65);
		
		for(int i=0; i<s.length;i++)
		{
			System.out.println("Name:" + s[i].name);
			System.out.println("Gender:" + s[i].gender);
			System.out.println();
		}
	}

}
