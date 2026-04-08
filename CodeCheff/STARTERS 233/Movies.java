import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int combos = Math.min(n, m);

            int cost = combos * c 
                     + (n - combos) * a 
                     + (m - combos) * b;

            System.out.println(cost);
        }
    }
}

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc= new Scanner(System.in);
		
		
// 		int t = sc.nextInt();
// 		int cost = 0;
		
// 		while (t-- > 0) {
// 		int n = sc.nextInt();
// 		int m = sc.nextInt();
// 		int a = sc.nextInt();
// 		int b = sc.nextInt();
// 		int c = sc.nextInt();
		
// 		if(n == m) {
// 		  cost = c+b;
		 
// 		} else if(n <m) {
		    
// 		    cost = (c+b);
		   
// 		} else {
		    
// 		    cost =(c+a);
// 		}
// 		System.out.println(cost);
// 		}
		
		

// 	}
// }


