package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task11332 {
  public void solve(int testNumber, Scanner in, PrintWriter out) {
    //Taking the modulo 9 of any number will return the sum of digits
    // of that number until a single digit number is obtained.
    while(in.hasNextInt()){
      int n = in.nextInt();
      if(n ==0) break;
      out.println((n%9 == 0) ? 9 : n%9);
    }
  }
}
