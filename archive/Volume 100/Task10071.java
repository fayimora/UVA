package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task10071 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      while(in.hasNextInt()){
        out.println(in.nextInt() * in.nextInt() *2);
      }
    }
}
