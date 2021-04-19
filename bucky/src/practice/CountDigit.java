package practice;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 543;
		int digit=3;
		
		System.out.println("digit "+digit+" appears in number "+number+" is:"+ countDigit(number,digit));

	}
	
	static int countDigit(int n, int digit) {
		
		int count=0;
		
		if(n<0) {
			return -1;
		}else {
			while(n>0) {
				int mod=n%10;
				n=n/10;
				
				if(mod==digit) {
					count++;
				}				
			}
		}
		
		return count;
		
	}

}
