package main;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Task11727 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int[] arr = {in.nextInt(), in.nextInt(), in.nextInt()};
      Arrays.sort(arr);
      out.printf("Case %d: %d\n", testNumber, arr[1]);
    }
}
