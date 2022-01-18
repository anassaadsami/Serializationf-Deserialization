package superClassNotSerialisation;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			File f = new File("/Users/Hiba/Desktop/serialization/Father");
			Sons.serializeObject(input, f);
			Sons.deserializeObject(f);
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		input.close();

	}

}
