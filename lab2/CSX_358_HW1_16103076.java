package lab2;
import java.io.*;
import java.util.*;
public class CSX_358_HW1_16103076 {
	public static void main(String[] args)throws FileNotFoundException{
		
		//opening file using scanner
		
		File file = new File("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\HW1\\HW1-data.txt");
		Scanner sc = new Scanner(file);
		
		
		String s;
		
		//list of student object that store all data of students
		
		List <Student> students = new ArrayList<Student>();
		Student student;
		
		while(sc.hasNextLine())
		{
			student = new Student();
			s = sc.nextLine();
			student.init(s);
			students.add(student);
		}
		sc.close();
		
		//now write all data of student in output data with proper formatting
		
		Filecreator fw = new Filecreator();
		fw.init(students);
		System.out.println("complete");
	}
}
