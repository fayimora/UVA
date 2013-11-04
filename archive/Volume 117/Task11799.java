package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task11799 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] speeds = new int[n];
      for (int i = 0; i < n; i++) speeds[i] = in.nextInt();
      int max = speeds[0];
      for (int i = 0; i < n; i++)
        max = (max < speeds[i]) ? speeds[i] : max;
      out.printf("Case %d: %d\n", testNumber, max);
    }
}
