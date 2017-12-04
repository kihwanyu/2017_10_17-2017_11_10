package nsc.test9;

public class Cargoplane extends Plane{
	public Cargoplane(){
		
	}
	public Cargoplane(String planeName, int fuelSize){
		super(planeName,fuelSize);
	}
	@Override
	public void flight(int distance){
		int fuel = super.getFuelSize();
		distance /= 10;
		for(int i = 0; i < distance; i++){
			fuel-=50;
		}
		super.setFuelSize(fuel);
	}
}
