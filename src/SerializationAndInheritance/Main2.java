package SerializationAndInheritance;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {   // we can deserialize the object from another main method

	public static void main(String[] args)throws IOException , ClassNotFoundException {
		Scanner input = new Scanner(System.in);
		File f ;
		try {
			f = new File("/Users/Hiba/Desktop/serialization/inherit");
			System.out.println(Main.deserializedObject(f).toString());
			
		}catch( IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		input.close();
		
		

	}

}
