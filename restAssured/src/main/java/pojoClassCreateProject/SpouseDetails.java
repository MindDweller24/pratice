package pojoClassCreateProject;

public class SpouseDetails {
	String name;
	int phno[];
	int age;
	public SpouseDetails(String name, int[] phno, int age) {
		super();
		this.name = name;
		this.phno = phno;
		this.age = age;
	}
	public SpouseDetails() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getPhno() {
		return phno;
	}
	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
