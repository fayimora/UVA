package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task12015 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();in.nextLine();

      while(in.hasNextLine() && testNumber <= n){
        int[] relevance = new int[10];
        String[] links = new String[10];

        for (int i = 0; i < 10; i++) {
          String s = in.nextLine();
          String[] line = s.split(" ");
          links[i] = line[0];
          relevance[i] = Integer.parseInt(line[1]);
        }

        int max = -1;
        for (int i = 0; i < 10; i++) max = max < relevance[i] ? relevance[i] : max;

        out.printf("Case #%d:\n", testNumber++);
        for (int i = 0; i < 10; i++)
          if(relevance[i] == max) out.println(links[i]);
      }
    }
}
