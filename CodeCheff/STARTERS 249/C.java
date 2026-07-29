import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int p = sc.nextInt();
      System.out.println(soln(x, y, p));
    }

  }

  static int soln(int x, int y, int p) {

    int move = 0;

    if (x * y >= p) {
      return 0;
    }

    while (x * y < p) {

      if (x > y) {
        y++;
      } else {
        x++;
      }

      move++;
    }
    return move;

  }
}