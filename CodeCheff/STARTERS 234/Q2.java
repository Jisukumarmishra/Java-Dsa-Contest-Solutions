import java.util.*;
import java.lang.*;
import java.io.*;


public class Q2 {

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//no of cakes ned to buy
		int k = sc.nextInt();// the bride amount
		// op = minium total cost of buying cake
		
// 		int totalcost;
		
// 		if (n %2 == 0) {
// 		     totalcost = k*n;
// 		} else {
// 		    totalcost = k * (n-1);
// 		}
		
// 		System.out.println("totalcost");

        int withoutBribe = 100 * n;
		int withBribe = k + (60 * n);
		
		int ans = Math.min(withoutBribe, withBribe);
		
		System.out.println(ans);
		

	}
}

  
}