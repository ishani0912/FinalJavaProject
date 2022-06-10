import com.globalpayex.bank.entities.Account;
import com.globalpayex.bank.exceptions.MinBalanceNotMaintainedException;

public class runAccount {
	
	public static void main(String[] args) {
		Account a = new Account(70000, "1213434567", "Current Account");
		
		System.out.println(a.deposit(500));
		
		//a single try can have multiple catch blocks
		//catchAll: single catch block(Exception: super class for other exceptions
		//syntax: catch(Exception e);
		//Readability compromised.
		
	/*	try {
			System.out.println(a.withdraw(-90));
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();  //generally used for developer. Debugger. Exception tracing
		}catch(IllegalArgumentException i) {
			System.out.println(i.getMessage());
			i.printStackTrace();
		}
				
	} */
		
		try {
			System.out.println(a.withdraw(8000));
		}catch (MinBalanceNotMaintainedException b) {
			System.out.println(b.getMessage());
			b.printStackTrace();
		}
			
		}
	
}
