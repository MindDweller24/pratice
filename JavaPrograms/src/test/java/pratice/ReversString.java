package pratice;

public class ReversString {
	public static void main(String[] args) {
		String s="1A3H6J8K2";
		String rev="";
		
		char[] chr = s.toCharArray();
		int x =s.length();
		int a = chr.length - 1;
	    while (a >= 0) {
	    	char ch = s.charAt(a);
	    	rev=rev+ch;
	    }
	    System.out.print(rev);
	    
//		StringBuffer sb=new StringBuffer(s);
//		StringBuffer str = sb.reverse();
//		System.out.println(str);
	}
	

}
