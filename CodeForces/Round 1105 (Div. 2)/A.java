import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
     long n = sc.nextLong();
     long k = sc.nextLong();

     long totalPopcount = 0;
     long currentPower = 1;

       while (n > 0 && currentPower <=n ) {
         long take = Math.min(k, n/currentPower);
         totalPopcount = totalPopcount + take ;
         n = n-(take * currentPower);
         currentPower = currentPower * 2 ;
       }

       System.out.println(totalPopcount);
  }
  sc.close();
 }
}
