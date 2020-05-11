import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Exam
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int given = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
		String fren = file.nextLine();
		String test = file.nextLine();
		
		int total = fren.length();
		int same = 0;
	    for (int x = 0; x != total;x++)
	    {
	    	if (fren.charAt(x) == test.charAt(x))
	    		same++;
	    }
		
		System.out.println((given>same)? (total-given+same):(total+given-same));
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Exam().run();
	}	
	
}