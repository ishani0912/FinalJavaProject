
public class Vowel {
	
	public static boolean isVowel(char v)
	{
		switch(v)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
			
		default:
			return false;
		
			
		}
	}
	
	public static void main(String[] args) {
		char c = 'a';
		System.out.println(isVowel(c));
		
	}

}
