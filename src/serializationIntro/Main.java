package serializationIntro;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee[] employee = new Employee[2];
		try {
			File f = new File("/Users/Hiba/Desktop/serialization/serilizable.Employee");
			FileOutputStream fileout = new FileOutputStream(f);
			ObjectOutputStream objout = new ObjectOutputStream(fileout);
			
			for (int i = 0; i < employee.length; i++) {
				employee[i]= Employee.createObject(input);
				objout.writeObject(employee[i]);
				System.out.println("object are serialized.");
				
			}
			
			objout.close();
			fileout.close();
			
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		input.close();

	}

}
