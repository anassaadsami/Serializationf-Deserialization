package superClassNotSerialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Sons extends Father implements Serializable {
	
	private static final long serialVersionUID = -3368024081424133785L;
	double salary ;
	String lastname;
	
	public Sons(String name, int age, double salary, String lastname) {
		super(name, age);
		this.salary = salary;
		this.lastname = lastname;
	}
	
	// method to create an object of Subscribe class
		public static Sons createObject(Scanner input, File f)throws IOException , ClassNotFoundException {
			Sons s ;
			System.out.print("enter your name:");
			String name = input.next();
			System.out.print("enter your age:");
			int age = input.nextInt();
			System.out.print("enter your salary:");
			double salary = input.nextDouble();
			System.out.print("enter your lastName:");
			String lastname = input.next();
			s = new Sons(name, age, salary, lastname);
			return s ;
			
		}
//		// this method to can show the super class fields when we serialize the subclass objects
		private void writeObject(ObjectOutputStream objout) throws IOException{   
			objout.defaultWriteObject();
			
			objout.writeObject(getName());   // the order of fields must be the same otherwise error
			objout.writeInt(getAge());
		}
		
//		// this method to can show the super class fields when we deserialize the subclass objects
		private void readObject(ObjectInputStream objIn) throws ClassNotFoundException , IOException{
			objIn.defaultReadObject();
			
			setName((String)objIn.readObject());   // the order of fields must be the same otherwise error
			setAge(objIn.readInt());
		}
		
		 
		// method to write object to a file by serialisation
		public static void serializeObject(Scanner input, File f)throws IOException , ClassNotFoundException {
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream objout = new ObjectOutputStream(fileout);
		
		objout.writeObject(Sons.createObject(input, f));
		System.out.println("object is serialized");
		
		objout.close();
		fileout.close();
		
		}
		
		// method to read object from  a file by deserialisation
		public static void deserializeObject(File f) throws ClassNotFoundException , IOException{
	
			FileInputStream fileIn = new FileInputStream(f);
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			Sons s = (Sons)objIn.readObject();
			System.out.println(s.toString());
			System.out.println("object is deserialized");
			objIn.close();
			fileIn.close();	
			
		}

		@Override
		public String toString() {
			return "Sons [salary=" + salary + ", lastname=" + lastname + ", name=" + name + ", age=" + age + "]";
		}
}
