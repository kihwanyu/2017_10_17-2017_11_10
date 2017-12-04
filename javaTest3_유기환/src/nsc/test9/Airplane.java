package nsc.test9;

public class Airplane extends Plane {
	public Airplane() {
		super();
	}
	public Airplane(String planeName, int fuelSize){
		super(planeName,fuelSize);
	}
	@Override
	public void flight(int distance){
		int fuel = super.getFuelSize();
		distance /= 10;
		for(int i = 0; i < distance; i++){
			fuel-=30;
		}
		super.setFuelSize(fuel);
	}
	
}
