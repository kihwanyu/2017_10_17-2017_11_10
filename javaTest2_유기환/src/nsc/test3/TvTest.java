package nsc.test3;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] tv = new Tv[3];
		tv[0] = new Tv("INFINIA", 1500000, "LED TV");
		tv[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tv[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		String maxName = " ";
		String minName = " ";
		for(int i = 0 ; i < tv.length; i++){
			if(max < tv[i].getPrice()){
				max = tv[i].getPrice();
				maxName = tv[i].getName();
			}
			if(min > tv[i].getPrice()){
				min = tv[i].getPrice();
				minName = tv[i].getName();
			}
		}
		for(int i = 0; i < tv.length; i++){
			System.out.println(tv[i].toString());
		}
		System.out.println("가격이 가장 비싼 제품은 : " + maxName);
		System.out.println("가격이 가장 싼 제품은 : " + minName);
	}

}
