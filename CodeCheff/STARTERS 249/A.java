import java.util.*;
import java.lang.*;
import java.io.*;

public class A {
  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    if (X % 11 == 0 && X <= 99) {
      System.out.printf("no");
    } else {
      System.out.println("yes");
    }

  }

}
