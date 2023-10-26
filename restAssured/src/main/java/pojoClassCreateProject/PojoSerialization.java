package pojoClassCreateProject;

public class PojoSerialization {
String name;
long phoneno;
int age;
public PojoSerialization(String name, long phoneno, int age) {
	super();
	this.name = name;
	this.phoneno = phoneno;
	this.age = age;
	
}
public PojoSerialization() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
