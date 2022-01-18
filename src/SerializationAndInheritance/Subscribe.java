package SerializationAndInheritance;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Subscribe extends Person{

	private static final long serialVersionUID = 3657591314305208840L;
	boolean isMarried ;
	double salary;
	
//	public Subscribe() {
//		
//	}

	public Subscribe(String name, int age, boolean isMarried, double salary) {
		super(name, age);  // if we didn't make constructor to super class
//		this.name = name;
//		this.age = age;
		this.isMarried = isMarried;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Man [isMarried=" + isMarried + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) throws IOException , ClassNotFoundException{
		Scanner input = new Scanner(System.in);
		File f ;
		try {
			f = new File("/Users/Hiba/Desktop/serialization/inherit");
			System.out.println(f.createNewFile());
			serializeObject(input, f);
		
		}catch( IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		input.close();
		
		
		

	}
	// method to create an object of Subscribe class
	public static Subscribe createObject(Scanner input, File f)throws IOException , ClassNotFoundException {
		Subscribe s ;
		System.out.print("enter your name:");
		String name = input.next();
		System.out.print("enter your age:");
		int age = input.nextInt();
		System.out.print("are you married?");
		boolean isMarried = input.nextBoolean();
		System.out.print("enter your salary:");
		double salary = input.nextDouble();
		s = new Subscribe(name,age,isMarried,salary);
		return s ;
		
	}
	 
	// method to write object to a file by serialisation
	public static void serializeObject(Scanner input, File f)throws IOException , ClassNotFoundException {
	FileOutputStream fileout = new FileOutputStream(f);
	ObjectOutputStream objout = new ObjectOutputStream(fileout);
	
	objout.writeObject(createObject(input, f));
	System.out.println("object is serialized");
	
	objout.close();
	fileout.close();
	
	}
	
	
	

}
