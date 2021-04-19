package queue;
import java.util.*;

public class index {
	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());//highest priority
		System.out.println();
		
		q.poll();//remove highest prioritys
		System.out.printf("%s ",q);
		
	}

}
