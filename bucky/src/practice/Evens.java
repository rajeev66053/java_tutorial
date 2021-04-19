package practice;

public class Evens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {2426,254,3454,1345,26,48,3456,8624};
		
		for(int num:numbers) {

			int return_value=isEvens(num);
			System.out.println(return_value);
//			System.out.println(num+':'+return_value);
		}

	}
	
	
	public static int isEvens(int n) {			
		
		while(n>0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				return 0;
			}
			n=n/10;
		}
		
		
		if(n==0) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
