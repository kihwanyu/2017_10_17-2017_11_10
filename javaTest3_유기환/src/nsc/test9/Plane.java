package nsc.test9;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public Plane() {
		super();
	}

	public abstract void flight(int distance);
	
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel){
		fuel+=this.getFuelSize();
		this.setFuelSize(fuel);
	}

	@Override
	public String toString() {
		return planeName +" "+ fuelSize;
	}
	
}
