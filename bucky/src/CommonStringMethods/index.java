package CommonStringMethods;

public class index {
	public static void main(String args[]) {
		String[] words= {"funk","chunk","furry","baconator"};
		
		//startsWith
		for(String w:words) {
			if(w.startsWith("fu")) {
				System.out.println(w + " starts with fu");
			}
		}
		
		//endsWith
		for(String w:words) {
			if(w.endsWith("unk")) {
				System.out.println(w + " ends with fu");
			}
		}
		
		
		String s="buckyrobertsbuckyroberts";
		
		//indexOf
		System.out.println(s.indexOf('k'));//first k
		System.out.println(s.indexOf('k',5));// index of k after first 5 character

		System.out.println(s.indexOf('x'));
		
		System.out.println(s.indexOf("rob"));//need double quote

		System.out.println(s.indexOf("rob",10));//need double quote
		
		String a="Bacon ";
		String b="monster";
		//concat string
		System.out.println(a + b);
		System.out.println(a.concat(b));

		System.out.println(a.replace('B', 'F'));
		

		System.out.println(b.toUpperCase());
		

		System.out.println(a.trim());
		
	}

}
