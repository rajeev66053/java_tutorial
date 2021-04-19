
package File;
import java.io.File;
import java.util.*;


public class index {
	public static void main(String[] args) {
		File x=new File("D:\\xampp_old2\\readme_de.txt");
		
		if(x.exists()) {
			System.out.println(x.getName() + "exist!");
		}else {
			System.out.println( "Doesnot exist!");
		}
		
		/*create file*/
		
		final Formatter y;
		
		try {
			y=new Formatter("D:\\fred.txt");
			System.out.println("You created a file");
		}
		catch(Exception e) {
			System.out.println("You got an error");
		}
		 
		
		/*create file an add content to it*/
		createfile g=new createfile();
		g.openFile();
		g.addRecords();
		g.closeFile();
		
		
		/*read file*/
		readfile r=new readfile();
		r.openFile();
		r.readFile();
		r.closeFile();
		
	}

}
