package serializationIntro;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{
	

	private static final long serialVersionUID = -143242939902209021L;
	String name ; 
	int age ; 
	double salary ; 
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	 // method create an object of Employee
	public static Employee createObject(Scanner input) throws Exception{
		Employee e;
		System.out.print("enter your name:");
		String name = input.next();
		System.out.print("enter your age:");
		int age = input.nextInt();
		System.out.print("enter your salary:");
		double salary = input.nextDouble();
		e = new Employee(name, age, salary);
		return e ;
		
	}
	
	public void sayHi() {
		System.out.println("hi "+ this.name);
	}

}
