package genericUtility;

import java.util.Random;

public class JavaLibrary {
	public int getRandomNum() {
		Random ran = new Random();
		int randomNum = ran.nextInt(1000);
		return randomNum;
		
	}

}
