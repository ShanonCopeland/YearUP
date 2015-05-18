
public class Account {
	
	private int m_accountID = -1;
	private String m_accountName;
	private int m_customerID = -1;
	private double m_amount = 0.0;
	
	public int GetAccountID(){
		return m_accountID;
	}
	
	@SuppressWarnings("unused")
	private void SetAccountID(int accountID){
		m_accountID = accountID;
	}
	
	public String GetAccountName(){
		return m_accountName;
	}
	
	@SuppressWarnings("unused")
	private void setAccountName(String accountName){
		m_accountName = accountName;
	}
	
	public int GetCustomerID(){
		return m_customerID;
	}
	
	@SuppressWarnings("unused")
	private void setCustomerID(int customerID){
		m_customerID = customerID;
	}
	
	public double GetAmount(){
		return m_amount;
	}
	
	private void SetAmount(double amount){
		m_amount = amount;
	}
	
	public Account(int accountID, String accountName, int customerID){
		m_accountID = accountID;
		m_accountName = accountName;
		m_customerID = customerID;
	}
	
	//@SuppressWarnings("unused")
	private void updateAmount(double newAmount){
		SetAmount(newAmount);
	}
	
	public void UpdateSecurely(double newAmount, String password){
		
		if (password != null){
			if (password.equals("admin")){
				updateAmount(newAmount);
				System.out.println("Updated amount in accout id "+m_accountID+" to "+ m_amount+" !");
			}
			else
			{
				System.out.println("Call the police! Unsecure access!");
			}
		}
		else
		{
			System.out.println("Null password submitted, please check and resubmit");
		}
	}

}
