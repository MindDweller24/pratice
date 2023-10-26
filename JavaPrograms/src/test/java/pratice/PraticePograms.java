package pratice;

import java.util.TreeSet;

public class PraticePograms {
	public static void main(String[] args) {
		String s="ab!1Be4u8f&2#";
		char[] ch = s.toCharArray();
		String m="";
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				m=m+ch[i];
			}
		}
		TreeSet<Object> set=new TreeSet<Object>();
		for(int i=0;i<m.length();i++) {
			set.add(m.charAt(i));
		}
		System.out.print(set);
		
	}
	

}
