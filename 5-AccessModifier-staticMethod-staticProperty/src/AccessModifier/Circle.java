package AccessModifier;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle(){
	
	}
	public Circle(double r){
	
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea(){
		double area = radius * radius * 3.14;
		return area;
	}
}
