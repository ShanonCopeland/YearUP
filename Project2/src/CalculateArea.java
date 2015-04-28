
public class CalculateArea {

	public static void main(String[] args) {
		
		// Calculate the area of a Circle!
		double CircleArea = CalculateCircleArea(4);
		System.out.println("The area of the circle is "+CircleArea+" !");
		
		// Calculate the area of a Rectangle!
		double RectangleArea = CalculateRectangleArea(4,4);
		System.out.println("The area of the circle is "+RectangleArea+" !");
	}
	
	static double CalculateCircleArea(int radius){
		double area = 3.14*radius*radius;
		return area;
		}
	
	static double CalculateRectangleArea(int length, int bredth){
		double area = length*bredth;
		return area;
		}

}
