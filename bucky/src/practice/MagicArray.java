package practice;

public class MagicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrays = {
				 {21, 3, 7, 9, 11, 4, 6}, {3} ,{8, 5, -5, 5, 3},{13, 4, 4, 4, 4},{10, 5, 5}, {0, 6, 8, 20}};
		
		for(int i=0; i<arrays.length;i++) {
			int return_value=isMagicArray (arrays[i]);
			System.out.println(return_value);
		}

	}
	
	public static int isMagicArray (int[] arr) {
		
		int first_num=arr[0];
		int sum=0;
		
		if(arr.length>1) {
			for(int i=1;i<arr.length;i++) {
				if(isPrime(arr[i])==1) {
					sum+=arr[i];
				}
			}
		}else {
			return 1;
		}
			
		
		if(sum==first_num) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int isPrime(int num) {
		
		
		if(num<=1) {
			return 0;
		}
		
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				return 0;
			}			
		}
		
		return 1;
		
	}

}
