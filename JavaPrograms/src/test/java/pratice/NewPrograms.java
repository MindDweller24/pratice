package pratice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewPrograms {
	@Test
	public void name() {
		String s="sannath";//snt
		int count=0;
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch!='a' && ch!='h') {
				set.add(s.charAt(i));
			}
			
		}
		
		System.out.println(set);
		
	}
	@Test
	public void intPallindrome() {
		int a=123;
		int temp=a;
		int sum=0;
		int rem;
		while(a>0) {
			rem=a%10;//3,2,1
			sum=(sum*10)+rem;//3,32,321
			rem=a/10;//12,1,0
			if(temp==sum) {
				System.out.println("it is a pallindrome");
			}
			else {
				System.out.println("it is not a pallindrome");
			}
			break;
			
		}
		
		
	}
	@Test
	public void sony() {
		String s="aba";
		char[] chr = s.toCharArray();
		int count=1;
		for(int i=0;i<chr.length;i++) {
			  for(int j=i+1;j<chr.length;j++) {
				  if(chr[i]==chr[j]){
					  count++;
					  if(count==2) {
						  System.out.println(chr[i]);
					  }
				  }
				  
			  }
			  
		}
	}
	public void sony1() {
		String s="aaBaabcDaA";
		
		
	}
	@Test
	public void sony2() {
		String s="aaabbcdddf";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]!=' ') {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						ch[j]=' ';
					}
				}
				if(count>=2) {
					System.out.print(ch[i]+""+count);
					
				}
				else {
					System.out.print(ch[i]+"");
				}
			}
		}
		
}
	@Test
	public void sony2UsingMap() {
		String s="aaabbcdddf";
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char chr = s.charAt(i);
			if(map.containsKey(chr)) {
				int count=map.get(chr);
				map.put(chr, ++count);
			}
			else {
				map.put(chr, 1);
			}
			
		}
		String str = map.toString();
		System.out.print(str);
		
	}
	@Test
	public void amdocs() {
		String s="hi! am! Arun!";
		String rev=" ";
		String []ch=s.split(" ");
		for(int i=0;i<ch.length;i++) {
			String str = ch[i];
			for(int j=str.length()-2;j>=0;j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print("! ");
				
			}
		}
	@Test
	public void amdocs1() {
		String s="java";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 if(map.containsKey(ch)) {
				int count= map.get(ch);
					map.put(ch, ++count);
				}
				else {
					map.put(ch, 1);
				}
			 }
		System.out.print(map);
	}
	@Test
	public void count() {
	String s1="sanat";
	String rev=" ",rev1=" ",revString;
	String s2="mohapatra";
	String s3=s1+s2;
	System.out.println(s3);
	for(int i=s1.length()-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	for(int j=s2.length()-1;j>=0;j--) {
		rev1=rev1+s2.charAt(j);
	}
   revString=rev+rev1;
   System.out.println(revString);
   if(s3.equalsIgnoreCase(revString)) {
	   System.out.println("pallindrome");
   }
   else {
	   System.out.println("not pallindrome");
   }
	
	
	
	}
	@Test
	public void removeDup() {
		String s="Assgard";
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
		char ch=	s.charAt(i);
		set.add(ch);
		}
		for(Character str:set) {
			System.out.print(str);	
		}
	}
	@Test
	public void worldClock() {
		String s="aaabbcdddf";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]!=' ') {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			}
			if (count>1) {
				System.out.print(ch[i]+""+count);
			}
			else {
				System.out.print(ch[i]+"");
			}
		}
		
	}
	@Test
	public void countLetter() {
		String s="aaabbcdddf";
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				map.put(ch, ++count);
			}
			else {
				map.put(ch, 1);
			}
			}
		System.out.println(map);
	}
	@Test
public void countAlphabet() {
	String s="a3b2cd2f4";
	for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if(Character.isDigit(ch)) {
			 for(int j=0;j<ch;j++) {
				 System.out.print("a");
				 
			 }
		 }
	}
}    @Test
	public void printHeightWidth() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginBtn = driver.findElement(By.name("login"));
		int height = loginBtn.getSize().getHeight();
		int width = loginBtn.getSize().getWidth();
		if(height==width) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are notequal");
		}

}
@Test
public void removeDupAndRev() {
	String s="assgarddloki";
	String str=new String();
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		rev=rev+ch;
		if(str.indexOf(ch)<0) {
			str=str+ch;
		}
	}
	System.out.println(str);
	
	
}
}
