package SerializationAndInheritance;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
	
	// if we want to deserialize an object from the same package we need just main method in any class in this package
	
//	private static final long serialVersionUID = -5216682725044030215L;
//	String name ;
//	int age ;
//	boolean isMarried ;
//	double salary;
//	
//	public Main() {
//		
//	}
//
//	public Main(String name, int age, boolean isMarried, double salary) {
//		this.name = name;
//		this.age = age;
//		this.isMarried = isMarried;
//		this.salary = salary;
//	
//	}
	

	public static void main(String[] args)throws IOException , ClassNotFoundException{
		Scanner input = new Scanner(System.in);
		File f ;
		Subscribe s ;
		try {
			f = new File("/Users/Hiba/Desktop/serialization/inherit");
			 s = deserializedObject(f);
			 System.out.println(s.toString());
			
		}catch( IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		input.close();
		
		
	}
//	@Override
//	public String toString() {
//		return "Main [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", salary=" + salary + "]";
//	}


		// method for reading an object from file and bring it into program
	// we can change the return type of method to void 
		public static Subscribe deserializedObject(File f) throws  ClassNotFoundException , IOException{
			Subscribe s ;
			FileInputStream fileIn = new FileInputStream(f);
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			s = (Subscribe)objIn.readObject();
//			System.out.println(s.toString());
			objIn.close();
			fileIn.close();
			return s ;
			
			
		}
	
	
}
