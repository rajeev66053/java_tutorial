package practice;
import java.util.Arrays;

public class DualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = { { 1, 2, 3, 0 }, { 1, 2, 2, 1, 3, 0 }, { 1, 1, 2, 2 } ,{1, 2, 1},{1,2},{}};
	
	for(int i=0;i<arr.length;i++) {
		int[] a=arr[i];
		System.out.println(Arrays.toString(a)+" is dualArray "+isDual(a));
		
	}

	}
	
	public static boolean isDual(int[] a) {
		
		boolean isDual=true;
		
		if(a.length>0) {
			if(a.length%2==0) {
			
				int sum1=a[0]+a[1];
				
				for(int j=2;j<a.length;j+=2) {
					
					int sum2=a[j]+a[j+1];
					
					if(sum1!=sum2) {
						isDual=false;
					}			
				}
			}else {
				isDual=false;
			}
		}
		
		return isDual;
	}

}
