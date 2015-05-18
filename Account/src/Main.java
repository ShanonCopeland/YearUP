public class Main {
	
	public static void main(String[] args) {
		Account savingsAccount = new Account(123, "Savings", 456);
		savingsAccount.UpdateSecurely(500,"Admin");
		savingsAccount.UpdateSecurely(1000,"Theif");
		savingsAccount.UpdateSecurely(0,null);
		//savingsAccount.m_amount = 0;
		System.out.println("Updated amount in account ID " + savingsAccount.GetAccountID()+" to "+savingsAccount.GetAmount());
	}
}

/* DEBUGGING ASSIGNMENT
 * In debug mode with the breakpoint the variables change only when the methods are stepped into.
 * You can step into the updatesavingsSecurly method by hitting F6.
 * 
 */
