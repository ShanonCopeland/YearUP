
public class largestNumber 
{

	public static void LargestNumberUsingForLoop(int[] inputArray)
	{	
		if(inputArray!=null)
		{	
			if(inputArray.length > 0)
			{
				int largestNumber = -1;
				for(int i=0;i<inputArray.length;i++)
				{
					int currentNumber = inputArray[i];
					if (currentNumber > largestNumber)
					{
						largestNumber = currentNumber;
					}
				}
				System.out.println(largestNumber +" is the greatest number found using a FOR LOOP !");
			}
			else
			{
				System.out.println("No data entered");
			}
		}
	}	

	
	public static void LargestNumberUsingWhileLoop(int[] array)
	{	
		if(array!=null)
		{	
			int largestNumber = -1;
			int counter = 0;
			
			while(counter < array.length)
			{
				int currentNumber = array[counter];
				if (currentNumber > largestNumber)
				{
					largestNumber = currentNumber;
				}
				
				counter++;
			}
			
			System.out.println(largestNumber +" is the greatest number found using a WHILE LOOP !");
		}
		else
		{
			System.out.println("No data entered");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] array = {85,29,34,110,43,250,456,0};
		
		LargestNumberUsingForLoop(array);
		
		LargestNumberUsingWhileLoop(array);

	}

}
