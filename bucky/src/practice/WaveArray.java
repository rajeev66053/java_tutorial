package practice;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{7, 2, 9, 10, 5},{2, 6, 3, 4},{4, 11, 12, 1, 6},{1, 0, 5}};
		
		for(int i=0;i<arr.length;i++) {
			
			int[] a=arr[i];
			
			System.out.println("Is waveArray "+isWave(a));
		}

	}
	
	 public static  int isWave (int [] a) {
		 
		 int retval=1;
		 
		 for(int i=0;i<a.length-1;i++) {
			 
			 if(a[i]%2==0) {
				 if(a[i+1]%2==0) {
					 retval=0;
					 break;
				 }
				 
			 }else {
				 if(a[i+1]%2 !=0) {
					 
					 retval=0;
					 break;
//					 
				 }
				 
			 }
			 
		 }
		 
		 return retval;
		 
	 }

}
