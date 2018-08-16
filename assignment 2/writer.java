package assignment2;

import java.io.FileWriter;
import java.util.*;
public class writer {
	
	public void init(List<String> dictionary,List<String> keywords)
	{
		try {
		FileWriter fw=new FileWriter("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\output\\HW2-output-16103076.txt",true);
		int count =0;
		
		//binary search for search in sorted file
		binarysearch finder = new binarysearch();
		for(String s:keywords)
		{
			if(finder.search(dictionary,s) == false)
			{
				count++;
				fw.write("keyword not found: " + s +"\r");
			}
		}
		fw.write("\r");
		fw.write("Number of keywords not found = " + Integer.toString(count) +"\r");
        fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
