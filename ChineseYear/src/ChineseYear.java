import.static.java.lang.System.out;

public class ChineseYear {

	public void EvaluateChineseYear(int unknownYear){
		
		// Constant Var
		int s_knownYear = 1900;
		
		if (unknownYear>= s_knownYear){
			
			// Init Vars
			int yearDifference = unknownYear - s_knownYear;
			int remainder = yearDifference%12;
			
			// Switch Statement
			switch (remainder){
			case 0: out.println(unknownYear + " is the year of the RAT !"); break;
			case 1: System.out.println(unknownYear + " is the year of the OX !"); break;
			case 2: System.out.println(unknownYear + " is the year of the TIGER !"); break;
			case 3: System.out.println(unknownYear + " is the year of the RABBIT !"); break;
			case 4: System.out.println(unknownYear + " is the year of the DRAGON !"); break;
			case 5: System.out.println(unknownYear + " is the year of the SNAKE !"); break;
			case 6: System.out.println(unknownYear + " is the year of the HORSE !"); break;
			case 7: System.out.println(unknownYear + " is the year of the SHEEP !"); break;
			case 8: System.out.println(unknownYear + " is the year of the MONKEY !"); break;
			case 9: System.out.println(unknownYear + " is the year of the ROOSTER !"); break;
			case 10: System.out.println(unknownYear + " is the year of the DOG !"); break;
			case 11: System.out.println(unknownYear + " is the year of the PIG !"); break;
			default: System.out.println("You broke the thinggy !"); break;
			}
		
		}
	
	}
	
	public static void main(String[] args) {
		
		ChineseYear myYear = new ChineseYear();
		myYear.EvaluateChineseYear(1990);

	}

}
