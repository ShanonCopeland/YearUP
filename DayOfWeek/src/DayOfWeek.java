import java.util.Scanner;

public class DayOfWeek {
	
	static String[] WeekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
	static String[] WeekendDays = {"Saturday","Sunday"};

	void EvaluateDayOfWeek(String dayOfweek){
		// Checks
		if (!dayOfweek.equals(null)){
			
			// Weekdays
			if(dayOfweek.equalsIgnoreCase("Monday")
					||dayOfweek.equalsIgnoreCase("Tuesday")
					||dayOfweek.equalsIgnoreCase("Wednesday")
					||dayOfweek.equalsIgnoreCase("Thursday")
					||dayOfweek.equalsIgnoreCase("Friday")){
				System.out.println(dayOfweek+" is a weekday !");
			}
			// Week ends
			else if(dayOfweek.equalsIgnoreCase("Saturday")||dayOfweek.equalsIgnoreCase("Sunday")){
				System.out.println(dayOfweek+" is a weekend day !");
			}
			else {
				System.out.println(dayOfweek+" is not a VALID ENTRY !");
			}
		}else {
			System.out.println("You did not Enter a Value");
		}
		
	}
	static void switchDayofweek(String dayOfweek){
		if (dayOfweek != null)
		{
			
			switch(dayOfweek.toLowerCase())
			{
			case("monday"): 
			case("tuesday"): 
			case("wednesday"): 
			case("thursday"): 
			case("friday"): 
			{
				System.out.println(dayOfweek+" is a Week Day !");
				break;
			}
			case("saturday"):
			case("sunday"):
			{
				System.out.println(dayOfweek+" is a Weekend Day !");
				break;
			}
			default: 
				System.out.println(dayOfweek+" is not a VALID ENTRY !");
				break;
			}
			
		}
		else
		{
			System.out.println(dayOfweek+" is not a VALID ENTRY !");
		}
		
	}
	
	public static boolean checkList(String[] arrayName, String arrayTarget) {
		for(String entry: arrayName){
			if(entry.equalsIgnoreCase(arrayTarget))
				return true;
		}
		return false;
	}
	
	static String getInput(){
		// Create scanner and init input
		Scanner input = new Scanner(System.in);
		String result = input.next();
		input.close();
		return result;
	}

	public static void main(String[] args) {
		
		// What do we want?
		System.out.println("Enter a new day of week:\n");
		
		// Method Calls
		//EvaluateDayOfWeek(getInput());
		DayOfWeek day = new DayOfWeek();
		Scanner input = new Scanner(System.in);
		String result = input.next();
		day.EvaluateDayOfWeek(result);
		input.close();
		
	}

}
