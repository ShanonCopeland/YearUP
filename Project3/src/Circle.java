public class Circle {
	// needs attributes and methods
	
	// Vars
	String m_color;
	String m_name;
	double m_radius;
	
	// Calculation Method
	double CalculateArea(){
		double area = 3.14*m_radius*m_radius;
		return area; 
	}
	
	// Print Color
	void printColor(){
		System.out.println("my color is: " + m_color);
	}
	
	// Print Radius
	void printRadius(){
		System.out.println("my radius is: " + m_radius);
	}
	
	// Print Method
	void printMethod(){
		System.out.println("This is a " + m_name +" !");
		System.out.println("my color is: " + m_color);
		System.out.println("my radius is: " + m_radius);
		System.out.println("--------------------------");
		//System.out.printf
	}
	
	// Single Param
	public Circle(double radius) {
		m_name = "Circle";
		m_color = "Grey";
		m_radius = radius;
	}
	
	// Double Param
	public Circle(String color, double radius) {
		m_name = "Medium Circle";
		m_color = color;
		m_radius = radius;
	}
	
	// Tripple Param
	public Circle(String name, String color, double radius) {
		m_name = name;
		m_color = color;
		m_radius = radius;
		
	}
}

	
	
	
