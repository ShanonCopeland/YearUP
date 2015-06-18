public class Main {
	
	// Main
	public static void main(String[] args) {
		
		Banker banker = new Banker(120000);
		banker.payTaxes(.33);
		banker.fileTaxReturn();
		
		System.out.println("--------------------");
		
		Scientist sci = new Scientist(90000);
		sci.payTaxes(.28);
		sci.fileTaxReturn();
		
		System.out.println("--------------------");
		
		SchoolTeacher st = new SchoolTeacher(50000);
		st.payTaxes(.23);
		st.fileTaxReturn();

	}


}
