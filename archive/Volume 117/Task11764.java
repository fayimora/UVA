package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task11764 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int numOfWalls = in.nextInt();
      int highs = 0;
      int lows = 0;
      int[] heights = new int[numOfWalls];
      for (int i = 0; i < numOfWalls; i++) heights[i] = in.nextInt();
      //out.println(Arrays.toString(heights));
      for (int i = 0; i < numOfWalls-1; i++)
        if(heights[i] < heights[i+1]) highs++;
        else if((heights[i] > heights[i+1])) lows++;
      out.printf("Case %d: %d %d\n", testNumber, highs, lows);
    }
}
