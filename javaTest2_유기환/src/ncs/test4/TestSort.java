package ncs.test4;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] before = new int [10];
		int[] after = new int[before.length];
		int temp;

		for(int i = 0; i < before.length; i++){
			before[i] = (int) ((Math.random()*(101-51)) + 51);
			after[i] = before[i];
		}
		for(int i = 0; i < after.length; i++){
			temp = i;
			for(int j = i+1; j < after.length; j++){
				if(after[temp]>after[j]){
					temp = j;
				}
			}
			swap(after,i,temp);
		}
		System.out.print("before : ");
		for(int i = 0; i < before.length; i++){
			System.out.print(before[i]+" ");
		}
		System.out.print("\nafter : ");
		for(int i = 0; i < after.length; i++){
			System.out.print(after[i]+" ");
		}
		
		
	}
	public static void swap(int[] after,int x,int y){
		int temp = after[x];
		after[x] = after[y];
		after[y] = temp;
	}

}
