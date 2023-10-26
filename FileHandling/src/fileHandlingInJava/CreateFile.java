package fileHandlingInJava;

import java.io.File;

public class CreateFile {
  public static void main(String[] args) {
	try {
		File myObj=new File("D:\\TY_NOTES\\FileHandling\\File1.txt");
		if(myObj.createNewFile()) {
			System.out.println("file created"+myObj.getName());
		}
		else {
			System.out.println("file already exists ");
		}
		
	} catch (Exception e) {
		System.out.println("an error occured");
	}
}

}
