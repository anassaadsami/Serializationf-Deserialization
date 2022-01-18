package skolan;

//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -3796882398046264724L;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

//	private static final long serialVersionUID = -6069681031715702543L;
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// we can do the main method here but in deserialized class must the same also

//	public static void main(String[] args) {
//		Student s1 = new Student("anas", 43);
//		try {
//
//			File f = new File("/Users/Hiba/Desktop/serialization/students");
//		
//			FileOutputStream fileout = new FileOutputStream(f);
//			ObjectOutputStream objout = new ObjectOutputStream(fileout);
//			objout.writeObject(s1);
//			System.out.println("object is serialized");
//			
//			objout.close();
//			fileout.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//
//		}
//
//	}

	public void printStudent() {
		System.out.println("welcome " + name);
	}
}
