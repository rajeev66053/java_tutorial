package practice;
import java.util.Arrays; 

public class ArrayValueRepeatToMakeNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5, 9, 12,-2,-1};
		int k=3;
		int n=10;
		
		System.out.println(Arrays.toString(fill(arr , k, n)));

	}
	
	public static int[] fill(int[] arr,int k, int n) {
		
		int j=0;
		int[] newArr = new int[n];
		
		
		for(int i=0;i<n;i++) {
					
			
			newArr[i]=arr[j];
			
			j++;
			
			if(j==k) {
				j=0;
			}
		}
		
		return newArr;
		
	}

}
