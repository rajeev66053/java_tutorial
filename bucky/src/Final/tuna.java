package Final;

public class tuna {
	private int sum;
	private final int NUMBER;
	
	public tuna(int x) {
		NUMBER= x;
	}
	public void add() {
		sum+=NUMBER;
	}
	
	public String tostring() {
		return String.format("Sum = %d\n",sum);
	}
}
