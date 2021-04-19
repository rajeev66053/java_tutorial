package CollectionMethodSort;
import java.util.*;

public class index {
	public static void main(String[] args) {
		
		String[] crap= {"apples","lemons","geese","bacon","youtube"};
		List<String> li=Arrays.asList(crap);
		
		Collections.sort(li);
		System.out.printf("%s\n", li);
		

		Collections.sort(li,Collections.reverseOrder());
		System.out.printf("%s\n", li);
	}

}
