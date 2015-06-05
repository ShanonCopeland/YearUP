import java.util.Scanner;

public class ReverseString {
	
	static String getInput(){
		// Create scanner and init input
		Scanner input = new Scanner(System.in);
		String result = input.next();
		input.close();
		return result;
	}
	
	public static String flipper(String input){
		
		// Push to array
		char[] chars = input.toCharArray();
				
		// Init Vars
		int start = 0;
		int mid = chars.length/2;
		int end = chars.length-1;
		//String output = null;
				
		// Flipper In-Place Logic
		for(int i=start, j=end; i<mid;i++,j--){
			char temp = chars[j];
			chars[j]=chars[i];
			chars[i]=temp;
		}
				
		// Convert Char Array to String
		String output = new String(chars);
				
		// Spit out result
		return output;
		
		}

	public static String flipper2(String input){
		String flipped = "";
		int end = input.length()-1;
		
		for(int i = end; i>=0; i--){
          flipped = flipped + input.charAt(i);
        }
      
        return flipped;
    }

		
		
	public static void main(String[] args) {
		
		System.out.println("Please enter your string for a palendrome check !");
		// Get input
		String in = getInput().toUpperCase();
		// Null Check
		if (in != null){
			// Print result
			System.out.println("Your new string is "+flipper(in)+" !");
			System.out.println("Your new string is "+flipper2(in)+" !");
			}
			
	}

}
