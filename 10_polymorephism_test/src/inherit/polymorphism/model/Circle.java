package inherit.polymorphism.model;

public class Circle implements IShape {
private double radius;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double result = java.lang.Math.PI*radius;
		return result;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double result = 2*java.lang.Math.PI*radius;
		return result;
	}
	
	
}
