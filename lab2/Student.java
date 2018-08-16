package lab2;
public class Student {
	long studentid;
	int ex,minor,fin,cl,pts,pct;
	int[] assignments;
	int total=0;
	char Gr;
	String s;
	
	//Round off function for round number to its nearest integer
	public int roundof(double x) {
		int y =(int) Math.round(x);
		return y;
	}
	
	//function for initialise all attributes of student
	public void init(String s){

		s = s.replaceAll("  "," ");
		String[] tokens=s.split(" ");
		studentid = Long.parseLong(tokens[0]);
		ex = Integer.valueOf(tokens[1]);
		assignments = new int[10];

		for(int i=2;i<12;i++)
		{
			assignments[i-2] = Integer.valueOf(tokens[i]);
			total += assignments[i-2];
		}
		minor = Integer.valueOf(tokens[12]);
		fin = Integer.valueOf(tokens[13]);
		cl = Integer.valueOf(tokens[14]);
		pts = ex + total + minor + fin + cl;
		double temp = ((double)pts*100)/420;
		pct = roundof(temp);
		if(pct>=90)Gr = 'A';
		else if(pct <= 89 && pct >= 78)Gr ='B';
		else if(pct <= 77 && pct >= 62)Gr ='C';
		else if(pct <= 61 && pct >= 46)Gr ='D';
		else if(pct <= 45)Gr ='F';
		
	}

}
