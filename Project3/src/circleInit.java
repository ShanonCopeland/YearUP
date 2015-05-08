public class circleInit{
	
	public static void main(String[] args) {
		
		// Big Circle
		Circle bigCircle = new Circle (10);
		bigCircle.CalculateArea();
		bigCircle.printMethod();
		
		// Medium Circle
		Circle mediumCircle = new Circle ("Blue",5);
		mediumCircle.CalculateArea();
		mediumCircle.printMethod();
		
		// Small Circle
		Circle smallCircle = new Circle ("Small Circle","Blue",5);
		smallCircle.CalculateArea();
		smallCircle.printMethod();
		
	}
	
}
