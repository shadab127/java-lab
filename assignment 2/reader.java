package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class reader {
public static void main(String[] args)throws FileNotFoundException{
		
		long startTime = System.nanoTime();
		
		//opening file using scanner
		
		File file1 = new File("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\csx-351-hw2-shadab127-master\\HW2-dictionary.txt");
		File file2 = new File("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\csx-351-hw2-shadab127-master\\HW2-keywords.txt");
		Scanner sc = new Scanner(file1);
		
		//storing the dictionary file in array of string
		List <String> dictionary = new ArrayList<String>();
		String temp;
		while(sc.hasNextLine())
		{
			temp = sc.nextLine();
			dictionary.add(temp);
		}
		
		//sorting dictionary
		Collections.sort(dictionary);
		sc.close();
		sc = new Scanner(file2);
		List <String> keywords = new ArrayList<String>();
		while(sc.hasNextLine())
		{
			temp = sc.nextLine();
			keywords.add(temp);
		}
		//sorting keywords
		Collections.sort(keywords);
		writer write = new writer();
		
		//class for writing in output file
		write.init(dictionary, keywords);
		sc.close();
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
			
}


}
