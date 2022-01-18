package serializationIntro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Employee2  { 
	
	// we make deserialization from the same package so we don't need to make same class we need just main method 
	//in any class in this package to code this 
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = null;    // here we create an object of the class which made Serialized 
		try {

			File f = new File("/Users/Hiba/Desktop/serialization/serilizable.Employee");
			FileInputStream fileIn = new FileInputStream(f);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			while ((employee = (Employee) objectIn.readObject()) != null) {

				System.out.println(employee.toString());    // to print all the object's fields by toString method which find in Employee class
//				System.out.println(employee.name);          // to print any of object's fields
//				if(employee.name.equals("anas")) {
//					System.out.println(employee.salary);     // check by name and print it's salary if find it
					employee.sayHi();                        // this method find just in Employee class
//				}
			}
			objectIn.close();
			fileIn.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		
	} 

	}
}
