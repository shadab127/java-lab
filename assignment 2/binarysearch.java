package assignment2;

import java.util.List;
import java.lang.String;
public class binarysearch {
	public int compare(String x,String y)
	{
		int n;
		if(x.length() > y.length())n=y.length();
		else
			n=x.length();
		for(int i=0;i<n;i++)
		{
			if(x.charAt(i) - y.charAt(i) > 0)
				return -1;
			else if(x.charAt(i) - y.charAt(i) < 0)
				return 1;
		}
		if(x.length() == y.length())return 0;
		else if(x.length() > y.length())return -1;
		else
			return 1;
		
	}
	public boolean searchutil(List<String> dictionary,String keyword,int l,int r)
	{
		if(l > r)return false;
		int mid = l + (r-l)/2;
		
		//function for comparision of two strings
		int x = compare(dictionary.get(mid),keyword);
		if(x == 0)return true;
		else if(x == 1)return searchutil(dictionary,keyword,mid+1,r);
		return searchutil(dictionary,keyword,l,mid-1);
	}
	public boolean search(List<String> dictionary,String keyword)
	{
		return searchutil(dictionary,keyword,0,dictionary.size());
	}

}
