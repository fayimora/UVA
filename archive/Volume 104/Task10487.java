package main;



import java.util.Scanner;
import java.io.PrintWriter;

public class Task10487 {
  public void solve(int testNumber, Scanner in, PrintWriter out) {
    int k = 1;
    while(in.hasNextInt()){
      int n = in.nextInt();
      if(n==0) break;
      int[] nums = new int[n];
      for (int i = 0; i < n; i++)
        nums[i] = in.nextInt();

      int len = in.nextInt();
      int[] queries = new int[len];
      for (int i = 0; i < queries.length; i++)
        queries[i] = in.nextInt();

      out.printf("Case %d:\n", k++);
      for(int currNum: queries){
        int res = closestSum(currNum, nums);
        out.printf("Closest sum to %d is %d.\n", currNum, res);
      }
    }
  }

  int closestSum(int currNum, int[] nums) {
    int currDiff = Integer.MAX_VALUE;
    int currClosest = -1;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i == j)
          continue;

        int sum = nums[i] + nums[j];
        int n = Math.abs(currNum - sum);
        if(n <= currDiff){
          currDiff = n;
          currClosest = sum;
        }
      }
    }
    return currClosest;
  }
}
