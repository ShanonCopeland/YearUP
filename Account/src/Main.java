public class Main {
	
	public static void main(String[] args) {
		Account savingsAccount = new Account(123, "Savings", 456);
		savingsAccount.UpdateSecurely(500, "admin");
		savingsAccount.UpdateSecurely(0,"Theif");
		//savingsAccount.m_amount = 0;
		System.out.println("Updated amount in account ID " + savingsAccount.GetAccountID()+" to "+savingsAccount.GetAmount());
	}
}
