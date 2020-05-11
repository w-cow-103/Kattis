// Will Cowden
// https://open.kattis.com/problems/combinationlock
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class combinationLock
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
	
		while(true)
		{
			int a = file.nextInt();
			int b = file.nextInt();
			int c = file.nextInt();
			int d = file.nextInt();
			
			if (a == b && a == c && a == d && a == 0)
				break;
			
			int degrees = 120;
			int fir = (40 + a - b) % 40;
			int sec = (40 - b + c) % 40;
			int thi = (40 + c - d) % 40;
			degrees = (degrees + fir + sec + thi) * 9;
			System.out.println(degrees);
			
			
			// (120 + (s - a + 40) % 40 + (b - a + 40) % 40 + (b - c + 40) % 40) * 9);
			
		}
	
	}

	public static void main(String[] args) throws Exception
	{
		new combinationLock().run();
	}	
	
}