
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
		// TODO Auto-generated method stub
		
		int[] arrayInput = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,0};
		// BLAH!
		int value = 7;
		loopSearch(arrayInput,value);
		loopCount(arrayInput,value);
	}

}
