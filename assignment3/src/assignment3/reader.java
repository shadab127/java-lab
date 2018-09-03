package assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class reader {
public static void main(String[] args)throws FileNotFoundException{
		
		long startTime = System.nanoTime();
		
		//opening file using scanner
		
		File file1 = new File("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\HW3\\HW3-unsorted-keywords.txt");
		File file2 = new File("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\HW3\\HW3-input-code.cpp");
		Scanner sc = new Scanner(file1);
		
		//storing the keywords file in array of string
		List <String> keywords = new ArrayList<String>();
		String temp;
		while(sc.hasNextLine())
		{
			temp = sc.nextLine();
			keywords.add(temp);
		}
		
		// sorting keywords
		Collections.sort(keywords);
		sc.close();
		sc = new Scanner(file2);
		
		// storing the keywords file in array of string
		List <String> inputcode = new ArrayList<String>();
		while(sc.hasNextLine())
		{
			temp = sc.nextLine();
			inputcode.add(temp);
		}
		sc.close();
				
		// class for writing in output file
		writer w = new writer();
		w.init(inputcode, keywords);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
			
}


}
