package CodeCheff.STARTERS 234;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Q1 {


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		  //  if ( m == n-1) {
		  //      System.out.println(m);
		  //  }
		    
		    int diff;
		    diff = n - m;
		  
		  //int time = (n * (n + 1)) / 2 - (m * (m + 1)) / 2;
		    
		  //System.out.println(time);
		    
		   int sum = 0;
		    
		    for (int i = 0; i < diff; i++) {
		        sum += (n - i);
		    }
		    
		    System.out.println(sum);
		    
		}

	}
}

  
}
