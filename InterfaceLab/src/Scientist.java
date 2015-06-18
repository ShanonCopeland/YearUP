import java.text.DecimalFormat;


public class Scientist implements Int_taxPayer {
	private double m_income;
	private boolean m_paidTaxes = false;
	private String name = this.getClass().getName().toUpperCase();
	
	// Getter
	public double getIncome() {
		return m_income;
	}

	// Setter
	private void setIncome(double income) {
		m_income = income;
	}

	public Scientist(double income){
		setIncome(income);
	}
	

	// Methods
	public void payTaxes(double taxRate){
		if (!m_paidTaxes){
			DecimalFormat df = new DecimalFormat("0.00"); 
			double payment = (getIncome()*taxRate);
			setIncome(getIncome()-payment);
			System.out.println("The "+name+" has paid $"+df.format(payment)+" in taxes !");
			m_paidTaxes = true;
		}
	}
	
	public void fileTaxReturn(){
		if (m_paidTaxes){
			System.out.println("The "+name+" has filed their tax return !");
		}
		else{
			System.out.println("The "+name+" has not yet filed their tax return, it will be filed at a later date !");
		}
	}
	
	// Main
	public static void main(String[] args) {
		
		

	}

}

