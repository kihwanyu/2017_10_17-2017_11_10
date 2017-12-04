package com.week4;

public class TestWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "J a v a  P r o g r a m ";
		str = str.toUpperCase();
		String[] str_array = str.split(" "); 
		
		for(int i = 0 ; i < str_array.length ; i++){
			System.out.println(str_array[i]);
		}
		
	}
}
