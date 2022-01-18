package superClassNotSerialisation;

public class Father {   // the super class dosen't implements Serializable so we need 
	String name;        // to override two methods in subclass 
	int age;
	
	public Father() {    // when super class does't implements Serializable so we must make non parametrised constructor otherwise error
		
	}
	
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	
	
}
