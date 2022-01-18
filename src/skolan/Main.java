package skolan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("anas", 43);
		Student s2 = new Student("ali", 38);
		try {

			File f = new File("/Users/Hiba/Desktop/serialization/students");
			System.out.println(f.createNewFile());
		
			FileOutputStream fileout = new FileOutputStream(f);
			ObjectOutputStream objout = new ObjectOutputStream(fileout);
			objout.writeObject(s1);
			objout.writeObject(s2);
			System.out.println("object is serialized");
			
			FileInputStream fileIn = new FileInputStream(f);
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			
			
			
			objout.close();
			fileout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}