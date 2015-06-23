public class ExceptionCentral {
	
	void arithmeticException(int input) throws ArithmeticException{
		int result = input/0;
		System.out.println("The result is: "+result);
	}
	
	void nullException(int input) throws NullPointerException{
		int result= (Integer) null;
		System.out.println(result*input);
	}
	
	void arrayExeption(int inputArray[]) throws ArrayIndexOutOfBoundsException{
		try
		{
			for(int i = 7; 1 <10; i++){
				System.out.println(inputArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException execptionObj){
			System.out.println("ERROR: Not enough indexes in array");
			execptionObj.printStackTrace();
		}
	}

	
	
	public static void main(String[] args) {
		int input = 3;
		
		ExceptionCentral exceptiondentral = new ExceptionCentral();
		try{
			exceptiondentral.arithmeticException(input);
		}
		catch (ArithmeticException ex){
			System.out.println("ERROR: Could not complete calculations !");
		}
		catch (NullPointerException ex2){
			System.out.println("ERROR: Null Value !");
		}
		catch (ArrayIndexOutOfBoundsException ex3){
			System.out.println("ERROR: Not enough indexes in array !");
		}
		//exceptiondentral.nullException(input);
		int inputArray[] = {1,2,3};
		exceptiondentral.arrayExeption(inputArray);
	}
}
