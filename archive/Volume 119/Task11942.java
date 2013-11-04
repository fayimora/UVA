package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task11942 {
  private int[] lengths = new int[10];
  public void solve(int testNumber, Scanner in, PrintWriter out) {
    if(testNumber==1)out.println("Lumberjacks:");
    for (int i = 0; i < 10; i++) lengths[i] = in.nextInt();
    if(isAscending() || isDescending()) out.println("Ordered");
    else out.println("Unordered");
  }

  boolean isAscending(){
    for (int i = 0; i < 10-1; i++) {
      if(lengths[i] > lengths[i+1]) return false;
    }
    return true;
  }

  boolean isDescending(){
    for (int i = 0; i < 10-1; i++) {
      if(lengths[i] < lengths[i+1]) return false;
    }
    return true;
  }
}
