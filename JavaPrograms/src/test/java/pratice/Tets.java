package pratice;

public class Tets implements Test,Kets{
	
	public void m1() {
		System.out.println("hi");
		
		
	}
	public static void main(String[] args) {
		Tets t=new Tets();
	t.m1();
	t.gk();
	t.ck();
	}
	public void gk() {
		System.out.println("bye");
		
	}
	public void ck() {
		System.out.println("again hi");
		
	}
	

}
