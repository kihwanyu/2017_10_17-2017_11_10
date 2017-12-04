package nsc.test9;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane airPlane = new Airplane("L747",1000);
		Cargoplane cargoPlane = new Cargoplane("C40",1000);
		System.out.println("Plane\tfuelSize");
		System.out.println("---------------------");
		System.out.println("airPlane : " + airPlane.toString());
		System.out.println("cargoPlane : " + cargoPlane.toString());
		airPlane.flight(100);
		cargoPlane.flight(100);
		System.out.println("100 운항");
		System.out.println("Plane\tfuelSize");
		System.out.println("---------------------");
		System.out.println("airPlane : " + airPlane.toString());
		System.out.println("cargoPlane : " + cargoPlane.toString());
		airPlane.refuel(200);
		cargoPlane.refuel(200);
		System.out.println("200 주유");
		System.out.println("Plane\tfuelSize");
		System.out.println("---------------------");
		System.out.println("airPlane : " + airPlane.toString());
		System.out.println("cargoPlane : " + cargoPlane.toString());
	}

}
