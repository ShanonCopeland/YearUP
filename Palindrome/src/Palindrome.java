import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String input){
		boolean isPalindrome = true;
		
		if (input != null){
			String wordInputNoSpace = input.replace(" ","");
			char[] inputchars = wordInputNoSpace.toCharArray();
			
			for (int i = 0, k = inputchars.length -1;i < inputchars.length/2;i++,k--){
				if (inputchars[i] != inputchars[k]){
					isPalindrome = false;
					break;
				}
			}
		}
		else{
			System.out.println("ERROR: NUll String !");
		}
		return isPalindrome;
	}
	
	
	static String getInput(){
		// Create scanner and init input
		Scanner input = new Scanner(System.in);
		String result = input.next();
		input.close();
		return result;
	}
	
	public static boolean checkPalindrome(String input){
		// Take input and create palendrome
		String stringHolder = "";
		int end = input.length()-1;
		// Loop checker
		for(int i = end; i>=0; i--){
			stringHolder = stringHolder + input.replace(" ","").charAt(i);
        }
		// Return Flipper
		
		if (input.equals(stringHolder)){ return true; } 
		else { return false; }
		
    }
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string for a Palendrome Check !");
		String s = getInput().toUpperCase();
		//System.out.println(s);

		// Logic
		if (isPalindrome(s)){
			System.out.println("This string is a palendrome !");
		}
		else {
			System.out.println("This string is not a palendrome !");
		}
		
      
	}
		

}
