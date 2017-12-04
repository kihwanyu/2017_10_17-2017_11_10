package inherit.polymorphism.model;

public class Triangle implements IShape {

	private double base;
	private double height;
	public Triangle() {
		super();
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		double result = (base * height)/2;
		return result;
	}

	@Override
	public double perimeter() {
		double result = hypotenuse()+base+height;
		return result;
	}
	public double hypotenuse() {
		double result = Math.sqrt(base*base+height*height);
		return result;
	}
	
}
