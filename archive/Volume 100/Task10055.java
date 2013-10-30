package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task10055 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      while (in.hasNext()){
        out.println((in.nextBigInteger().subtract(in.nextBigInteger()).abs()));
      }
    }
}
