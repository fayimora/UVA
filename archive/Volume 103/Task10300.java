package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task10300 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      StringBuilder sb = new StringBuilder();
      int noOfFarmers = in.nextInt();
      int sumSoFar = 0;
      while(noOfFarmers >= 1){
        int a = in.nextInt();
        in.nextInt();
        int c = in.nextInt();
        int premium = (a * c);
        sumSoFar += premium;
        noOfFarmers--;
      }
      sb.append(sumSoFar);
      out.println(sb.toString());
    }
}
