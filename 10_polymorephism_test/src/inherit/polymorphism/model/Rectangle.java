package inherit.polymorphism.model;

public class Rectangle implements IShape {
	private double width;
	private double heigth;

	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}


	@Override
	public double area() {
		double result = width * heigth;
		return result;
	}

	
	
	@Override
	public double perimeter() {
		double result = 2 * width * heigth;
		
		return result;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	

}
