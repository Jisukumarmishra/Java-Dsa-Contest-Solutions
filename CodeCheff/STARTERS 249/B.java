import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    while (T-- > 0) {

      int X = sc.nextInt();
      int Y = sc.nextInt();
      int Z = sc.nextInt();

      System.out.println(soln(X, Y, Z));

    }

  }

  static int soln(int X, int Y, int Z) {

    int price = X;
    int coins = 0;
    int months = 0;

    if (Y >= Z) {
      return -1;
    }

    while (coins < price) {

      price += Y; // GPU price increases
      coins += Z; // Chef earns coins
      months++;
    }

    return months;

  }
}