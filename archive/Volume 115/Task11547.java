package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task11547 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      String res = ((((((n*567)/9) + 7492) * 235)/47) - 498) + "";
      out.println(res.charAt(res.length()-2));
    }
}
