package SerializationAndInheritance;

import java.io.Serializable;

public class Person implements Serializable{   // the super class implements Serializable and that's why we subclass don't need to implements Serializable
	
	private static final long serialVersionUID = 5052025868299488388L;
	
	String name;
	int age;
	
	// we can not make constructor to super class if we dont need to create an object of it
//	public Person() {  // it's very important if the super class does't implements Serializable have non parameterised constructor 
//		
//	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
