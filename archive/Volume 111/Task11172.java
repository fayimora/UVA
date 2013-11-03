package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task11172 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int a = in.nextInt();
      int b = in.nextInt();
      String res = a == b ? "=" : a<b ? "<" : ">";
      out.println(res);
    }
}
