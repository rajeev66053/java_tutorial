package File;

import java.io.File;
import java.lang.*;
import java.util.*;

public class createfile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x=new Formatter("chinese.txt");
		}
		catch(Exception e) {
			System.out.println("You have an error");
		}
	}
	
	public void addRecords() {
		x.format("%s%s%s", "20 ","bucky ","roborts");
		x.format("%s%s%s", "60 ","joe ","doe");
		x.format("%s%s%s", "50 ","mike ","ike");
		x.format("%s%s%s", "49 ","sis ","priss");
	}
	
	public void closeFile() {
		x.close();
	}

}
