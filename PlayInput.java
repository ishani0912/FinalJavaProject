import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number n:");

		try {
			int n = scanner.nextInt();	
			System.out.println(n % 2 ==0 ? "even" : "odd");
		}catch(InputMismatchException e) {
			System.out.println("please enter only integer values");
		}
		
		scanner.close();
		System.out.println("Program ended");
	}

}

//Exceptions always occur while running the program
//some exceptions occur due to the program logic
//try block: only the statements used to run the exception. Related statements 
//           can be entered inside the try block