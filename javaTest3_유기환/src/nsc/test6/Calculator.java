package nsc.test6;

public class Calculator {
	public double getSum(int data){
		double result = 0;
		for(int i = 1; i <= data; i++){
			result += i;
		}
		return result;
	}
}
