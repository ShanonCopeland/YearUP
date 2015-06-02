
public class Loops {
	
	public static void loopSearch(int inputArray[], int searchValue){
		
		if (inputArray != null){
			
			if(inputArray.length > 0){
				
				for(int i=0;i<inputArray.length;i++){
					
					if (inputArray[i] == searchValue){
						
						System.out.println("This array contains the given value of: "+ searchValue + " in index "+i+" !");
						break;
					}
					
				}
			}
			else{System.out.println("ERROR: Array contains no values, CANNOT SEARCH !");}
		}
		else{System.out.println("ERROR: Array is NULL !");}
	}
		
	public static void loopCount(int inputArray[], int searchValue){

		if (inputArray != null){
			
			if(inputArray.length > 0){
				
				int counter = 0;
				
				for(int i=0;i<inputArray.length;i++){
					
					if (inputArray[i] == searchValue){
						counter++;
						}
				}
				
				System.out.println("This array contains the given value " + counter + " times !");
			}
			else{System.out.println("ERROR: Array contains no values, CANNOT  COUNT !");}
		}
		else{System.out.println("ERROR: Array is NULL !");}
	}
		
	

	public static void main(String[] args) {
		
		
		// BLAH!
		int value = 7;
		int[] arrayInput = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,0};
		System.out.println("//////// REGULAR METHOD ////////");
		loopSearch(arrayInput,value);
		loopCount(arrayInput,value);
		
		int value2 = 0;
		int[] arrayInput2 = null;
		System.out.println("//////// NUll VALUE METHODS ////////");
		loopSearch(arrayInput2,value2);
		loopCount(arrayInput2,value2);
		
		int value3 = 0;
		int[] arrayInput3 = {};
		System.out.println("//////// NO ENTRY METHODS ////////");
		loopSearch(arrayInput3,value3);
		loopCount(arrayInput3,value3);
	}

}
