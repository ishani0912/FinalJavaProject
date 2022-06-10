
public class StringOperations {

	public static void main(String[] args) {
		String s1 = "ISHANI";
		String s2 = "ish";
		String s3 = "ani";
		String s4 = s2+s3;
		String s5 = "ISHANI";
		
		System.out.println(s1==s5); //string pool. will check if object with similar content exists already.
	
		System.out.println(s1.equals(s4));
		System.out.println(s1 == s4); //value with the same value but address is different. Should not be used for comparing strings
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}
