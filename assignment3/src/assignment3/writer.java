package assignment3;

import java.io.FileWriter;
import java.util.*;
public class writer {
	
	public void init(List<String> inputcode,List<String> keywords)
	{
		try {
		FileWriter fw=new FileWriter("C:\\Users\\Shadab Khan\\Desktop\\shadab_76\\output\\HW3-output-16103076.txt");
		int count =0;
		int linecount = 0;
		int indexofword = 0;
		int lastindex = 0;
		//binary search for search in sorted file
		binarysearch finder = new binarysearch();
		for(String s:inputcode)
		{
			lastindex = 0;
			linecount++;
			String p = s;
			String output= "Line " + Integer.toString(linecount) +": ";
			p = p.replace("["," ");
			p = p.replace("]"," ");
			p = p.replaceAll("[<>{}#*+-=()|&;]", " ");
			//System.out.println(p);
			Scanner sc = new Scanner(p);
			while(sc.hasNext()){
				String word = sc.next();
			    if(word == "//")
			    {
			    	break;
			    }
			    if(word != "") {
			    if(finder.search(keywords, word))
			    {
			    	count++;
			    	indexofword = p.indexOf(word, lastindex );
			    	System.out.println(indexofword);
			    	lastindex = p.lastIndexOf(word , indexofword );
			    	output += word + "(" + Integer.toString(indexofword) + ") ";
			    }
			    }
			}
			sc.close();
			if(output.equals("Line " + Integer.toString(linecount) +": ") && linecount == inputcode.size() - 1)
			{
				break;
			}
			if(output.equals("Line " + Integer.toString(linecount) +": "))
			{
				continue;
			}
			output += "\n";
			fw.write(output);
		}
		
		
		fw.write("\n");
		fw.write("Number of keywords found = " + Integer.toString(count) +"\n");
        fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
