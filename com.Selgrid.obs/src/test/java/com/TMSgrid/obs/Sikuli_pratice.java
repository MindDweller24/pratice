package com.TMSgrid.obs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_pratice {
	public static void main(String[] args) throws FindFailed, AWTException, InterruptedException {
		Screen sc=new Screen();
		Pattern p=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\minimize.PNG");
		sc.click(p);
		
//		Pattern p2=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\capture4.png");
//		sc.click(p2);
//		
//		Pattern p3=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\capture3.png");
//		sc.click(p3);
//		sc.type("paint");
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
		Pattern p1=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\chrome.png");
		sc.click(p1);
//		Pattern p2=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\whatsappType.png");
//		sc.click(p2);
//		Pattern p2=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\whatsapp.png");
//		sc.click(p2);
//		Thread.sleep(2000);
		Pattern p3=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\anilWp.png");
		sc.click(p3);
//		Pattern p4=new Pattern("D:\\selenium question\\com.TMSgrid.obs\\test-output\\chromesearchbar.png");
//		sc.click(p4);
		sc.type("betichod");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
	

}
