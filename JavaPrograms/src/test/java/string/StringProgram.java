package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class StringProgram {
	public void reverseAString() {
		String s="Bangalore";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	@Test
	public void revStringWithoutForLoop() {
		
	String s="karnataka";
	int i=s.length();//take length of string
	while(i>0) {//loop will iterate till i value is greater than 0
		System.out.print(s.charAt(i-1));//
		i--;
	}

	}

	@Test
public void revStringUsingStringBuffer() {
		String str="i do gym";
	StringBuffer s=new StringBuffer(str);//create obj of stringbuffer pass argument as string ref var
	System.out.println("reversed String= "+s.reverse());//stringbuffer ref var.reverse()
	//System.out.println(s.codePointAt(0));
}
	@Test
	public void OccuranceOfCharacters() {
		String str="testyantra";
        int []a = new int[256];
        for (int i = 0; i < str.length(); i++) {
            a[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (a[i] != 0) {
                System.out.println((char) i + " --> " + a[i]);       
            }
        }
				
	}@Test
	public void OccuranceOfEachChar() {
		String s="testyantra";//take a string value
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();//strore charactes as key and their count as values
		for (int i = 0; i < s.length(); i++) {
		  char ch = s.charAt(i);//takes each char and store in ch
		  if (map.containsKey(ch)) {//check map contains the key char
		    int count = map.get(ch);//get the count of each char
		    map.put(ch, ++count);//as per character present char the count will increase
		  } else {
		    map.put(ch, 1);//else count remain 1
		  }	  
		}
		 Set<Entry<Character, Integer>> set = map.entrySet();//for printing key value pair
		for(Entry<Character,Integer>entry:set) {
			System.out.println(entry);
		}
		System.out.println(map);
	}
	@Test
	public void removeDuplicates() {
		String s="testyantra";
		String str=new String();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(str.indexOf(ch)<0) {
				str=str+ch;
			}
		}
		System.out.println(str);
	}

	
	@Test
	public void countDuplicates() {
		
		String str="testyantra";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]!=' ') {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count ++;
						ch[j]=' ';
					}
				}
				if(count>=2) {
					System.out.println(ch[i]+"----->"+count);
				}
				
			}
		}
	}
	@Test
	public void  stringPallindrome() {
		String str="Malayalam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("its a pallindrome ");
		}
		else {
			System.out.println("its not a pallindrome");
		}
	}
	@Test
	public void positionOfEachChars() {
		String s="testyantra";
		ArrayList<Character> al=new ArrayList<Character>();//Arraylist to store the characters,it will not remove duplicates
		for(int i=0;i<s.length();i++) {
			al.add(s.charAt(i));//adding char to arraylist
		}
		for(Character ch:al) {
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+" is in "+(i+1)+" position" );
					break;
				}
			}
		}
	}
	@Test
	public void positionOfEachCharsWithoutDuplicates() {
		String str="Testyantra";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+" is in "+(i+1)+" position" );
					break;
				}
			}
		}
	}
	@Test
	public void positionOfEachCharsInRev() {
		String s="testyantra";
		ArrayList<Character> al=new ArrayList<Character>();//Arraylist to store the characters,it will not remove duplicates
		for(int i=0;i<s.length();i++) {
			al.add(s.charAt(i));//adding char to arraylist
		}
		for(Character ch:al) {
			for(int i=s.length()-1;i>=0;i--) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+" is in "+(i+1)+" position" );
					break;
				}
			}
		}
	}
	@Test
	public void reverseAgivenString() {
		String str="I am from TestYantra";
		String [] s = str.split(" ");
		
		for(int i=s.length-1;i>=0;i--) {
			
			System.out.print(s[i]+" ");
		}
		
	}
	@Test
	public void reverseTheWordsInAString() {
		String str="I am from TestYantra";
		String [] s = str.split(" ");//{"i","am","from","testyantra"}
		
		for(int i=0;i<s.length;i++) {//0
			String a=s[i];//i
			for(int j=a.length()-1;j>=0;j--) {
				System.out.print(a.charAt(j));//i,ma,morf
			}
			System.out.print(" ");
			
		}
		
	}
	@Test
	public void swapFirstAndLastWords() {
		String str="I am from TestYantra";
		String []s=str.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
	}
	@Test
	public void findOccuranceOfEachWordUsingMap() {
		String str="I am From TestYantra";
		String lc = str.toLowerCase();
		String []s=lc.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for(String ch:set) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(ch.equals(s[i])) {
					count++;
				}
			}
			System.out.println(ch+" is repeating "+count+" times");
			
		}
		
	}
	@Test
	public void reverseEveryWords() {
		String str="I got lost in her eyes";
		String lc = str.toLowerCase();
		String [] s=lc.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
			
		}
	}
	@Test
	public void countNumberOfVowelsInAStringWithDuplicates() {
		String str="India";
		String s = str.toLowerCase();
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++) {
		if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {	
			count++;
			System.out.println(ch[i]+" is "+count+"number vowel");
			
		}
		
	}
		//System.out.println(count);
}
	@Test
	public void countNumberOfVowelsInAStringWithoutDuplicates() {
		String str="India";
		String s = str.toLowerCase();
		char[] ch=s.toCharArray();
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(Character c:set) {
			if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u') {	
				count++;
				System.out.println(c+" is "+count+"number vowel");
			
	}
		//System.out.println(count);
}
}
	@Test
	public void segregateAlphabetsNumbersAndSpecialCharactersFromAString() {
		String s="a12#@B!&c";
		String alpha=".";
		String num=" ";
		String spc=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'  ) {
				alpha=alpha+ch;
			}
			else if(ch>='0' && ch<='9') {
				num=num+ch;
			}
			else {
				spc=spc+ch;
			}
		}
		System.out.println(alpha+num+spc);
		}
	@Test
	public void sumOfDigitsinAString() {
		String s="a12#@B3&c";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				int n = ch-48;
				sum=sum+n;
			}
		}
		System.out.println("sum of digits= "+sum);
	}
	@Test
	public void sumOfTwodigitNumber() {
		String s="11a12#b3";
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++) {
			//i=0 0<7t,i=1 1<7t,i=2 2<7t,i=3 3<7t,i=4 4<7t
			
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {//1t,1t,af,1t
				int n = ch-48;//n=49-48=1,1,1,
				tsum=tsum*10+n;//tsum=1,11,
		}
			else {
				sum=sum+tsum;//11
				tsum=0;
			}
	}
		sum=sum+tsum;//sum=1,
		System.out.println(sum);
	}	
	@Test
		public void printMinLengthValue() {
		String []s= {"12","1234","12345","45","1434234"};
		String min_length=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()<min_length.length()) {
				min_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==min_length.length()) {
				System.out.println(s[i]+" ");
			}
		}
	}
	
	@Test
	public void printMaxLengthValue() {
	String []s= {"12","1234","12345","45","1434234"};
	String max_length=s[0];
	for(int i=0;i<s.length;i++) {
		if(s[i].length()>max_length.length()) {//if length of 1st string value is greater than max_length(s[0])
			max_length=s[i];//store 1st string value in max_length
		}
	}
	for(int i=0;i<s.length;i++) {
		if(s[i].length()==max_length.length()) {
			System.out.println(s[i]+" ");
		}
	}
}
	@Test
	public void removeTheWordsWithoutSpace() {
		String str="I am a testengineer";
		String [] s = str.split(" ");//{"i","am","from","testyantra"}
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length;i++) {
			set.add(str.charAt(i));
		}
		for(Character ch:set) {
			for(int i=0;i<str.length();i++) {
				System.out.println(ch);
					break;
			}
		}
		}
	@Test
	public void newString() {
		String str="charare";
		char[] ch = str.toCharArray();
		char x='e';
		for(int i=ch.length-1;i>0;i--) {
			ch[i]=ch[i-1];
			
		}
		ch[0]=x;
		System.out.println(ch);
		
	}
	@Test
	public void reverseWords() {
		String str="welcome to expleo";
		String[] s=str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
			
		}
	}
	@Test
	public void maxOccuringChar() {
		String str = "sample string";
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		char ans=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
			if(count<hm.get(ch)) {
				ans=ch;
				count=hm.get(ch);
			}
		}
	 System.out.print(ans+" "+count);
	}
	
	@Test
	public void date() {
		String s="today id friday";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
	@Test
	public void productOfMax3() {
		int[] a= {12,2,4,22,15};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}	
			}
		int prod=1;
		for(int i=0;i<3;i++) {
			prod=prod*a[i];
			
		}
		System.out.println(prod);
	}
	@Test
	public void triangle() {
		String s="selenium";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				char a = s.charAt(j);
				System.out.print(a);
			}
			System.out.println(" ");
		}
	}
	@Test
	public void tryCatchFinally() {
		int[] a= {12,2,4,22,15};
		try {
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("welcome");
		}
	}
	@Test
	public void removespecial() {
		String s="dadakop&22D2!h";
		char[] c = s.toCharArray();
		String alphabet="";
		String character="";
		String number="";
		for(int i=0;i<c.length;i++) {
			if(Character.isAlphabetic(c[i])) {
				alphabet=alphabet+c[i];
			}
			else if(Character.isDigit(c[i])) {
				number=number+c[i];
			}
			else {
				character=character+c[i];
			}
		}
		System.out.println(alphabet);
		System.out.println(number);
		System.out.println(character);
	}
	@Test
	public void notRepeated() {
		String s="acbdkdaddwda";
		char[] ch = s.toCharArray();
		HashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			//char c=str.charAt(ch[i]);
			set.add(ch[i]);}
			for(Character str:set) {
						
			System.out.print(str);
	}
		
}
	@Test
	public void ace() {
		String s="ABCDEF";
		 char[]ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {

			if(i%2==0) {
				System.out.print(ch[i]);
				
			}
			
		}
	}
	@Test
	public void wordRev() {
		String s="hi i am a sanat";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String word = str[i];
			for(int j=word.length()-1;j>=0;j--) {
				System.out.print(word.charAt(i));
			}
//			for(int j=s.length()-1;j>=0;j--)
//			System.out.print(s.charAt(i));
		}
		
	}
	@Test
	public void elvnMul() {
		int a=11;
		int mul;
		for(int i=1;i<=9;i++) {
			mul=a*i;
			System.out.println(mul);
		}
		
	}
	@Test
	public void addAndPrint() {
		
		String str="aaacbbbdeefgg";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]!=' ') {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count ++;
						ch[j]=' ';
					}
				}
				if(count>=2 ) 
					System.out.print(ch[i]+""+count);
				else {
					System.out.print(ch[i]+"");
				}
					}
				}

	}
	@Test
	public void printDifferently() {
		String s="i am selenium";
		char[] ch = s.toCharArray();
		char[] ch1 = new char[ch.length];
		//String s1 = "";
		int j=0;
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[j]==' ') {
				j++;
				ch1[j]=ch[j];
				ch1[j++]=ch[i];
				
			}
			else if (ch[i]!=' ') {
				ch1[j++]=ch[i];
				
			}
		}
		System.out.print(ch1);
		
	}
	@Test
	public void chars() {
		int count=0;
		String a[]= {"a","b","c","a","d","a","d","c","b"};
		//op:a=3,b=2,c=2,d=2
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println(a[i]+count);
		}
	}
	@Test
	public void fetchUpperAndLower() {
		String s="Hello Java";
		//char[] ch = new char[s.length()];
		char[] ch = s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			//ch[i]=s.charAt(i);
//			System.out.print(ch[i]);	
		}
		
	}
	@Test
	public void removeDup() {
		String str = "sample string";
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		
		}
		for(Character ch:set) {
			System.out.print(ch);
		}
				
		}
	@Test
	public void printCountOfChar() {
		String s="a3b2cd2";
		char ch[]=s.toCharArray();
		String[] str = s.split(" ");
		  for(int i=0;i<ch.length;i++){
		     
	}

}
	@Test
	public void trianglePrint() {
		String s="aeiou";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				char a = s.charAt(j);
				System.out.print(a);
			}
			System.out.println(" ");
		}
	}
	@Test
	public void oddEven() {
		int a[]= {1,2,50,55,90,100};
		int odd[]=new int[a.length];
		int even[]=new int[a.length];	
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[i]=a[i];		
			}
			else {
				odd[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));
	}
	@Test
	public void checkArray() {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[8];
		System.out.println("enter the value");
		int i=sc.nextInt();
		for(int j=0;j<a.length;j++) {
			a[j]=i;
		}
		System.out.println(Arrays.toString(a));
	}
	@Test
	public void removeDuplicateWords() {
		String s="hi india all india";
		String[] ch = s.split(" ");
		Set<String> set=new LinkedHashSet<String>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(String ss:set) {
			System.out.print(ss+" ");
		}
System.out.println();		
	}
	@Test
	public void printCountedCharacters() {
		String s="a3b2cd2";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
//				char num=ch[i];
				int x=Character.getNumericValue(ch[i]);
				
				for(int j=0;j<x;j++) {
					System.out.print(ch[i-1]);	
			}
			}	
		}	
	}
	@Test
	public void printName() {
		String s="sannath";
		int m=0;
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i;j<s.length();j++) 
			{
				System.out.print(s.charAt(j));
				break;
			}
			m++;
			i=i+m;
		}
	}
//	public void occuranceOfEachCharacter() {
//		String s="showittous";
//		char ch[]=s.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			for(int j=0;j<ch.length;j++) {
//				
//			}
//		}
//	}
//	@Test
//	public void app() {
//		String a[]= {"bcapp","apple","licappation","apply"};
//		String str = a.toString();
//		for(int i=0;i<str.length();i++) {
//			 char ch=str.charAt(i);
//			 System.out.print(ch);
//		}
//	
//}
	@Test
	public void takeWordOutOfString() {
		String s="javaseleniumjavajava";
		String [] str = s.split("java");
		for(int i=0;i<str.length;i++) {
			if(str[i].equalsIgnoreCase("selenium")) {
				System.out.println(str[i]);
			}
		}
	}
	
	@Test
	public void writeNumberOfDuplicateWords() {
		String s="hi all to all is all to";
		 String[] ch = s.split(" ");
		 Map<Object, Integer> map=new HashMap<Object, Integer>();
		for(int i=0;i<ch.length;i++) {
			char chr = s.charAt(i);
			map.put(ch[i], i);
		}
		for(Entry<Object, Integer> mp:map.entrySet()) {
			int count=1;
			for(int i=0;i<ch.length;i++) {
			if(mp.getKey().equals(ch[i])) {
				count++;
			}
		}
		System.out.println(mp.getKey()+" repeating for "+count);	
	}
	}
	
}
