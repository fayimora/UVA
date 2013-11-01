package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task10550 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      while(in.hasNextLine()){
        int initPos = in.nextInt();
        int c1 = in.nextInt();
        int c2 = in.nextInt();
        int c3 = in.nextInt();
        if(initPos == 0 && c1 == 0 && c2 == 0 && c3 == 0) break;

        long answer = 1080; // sum of known degrees
        answer += initPos > c1 ? (initPos - c1)*9 : (40 + initPos - c1)*9;

        answer += c2 < c1 ? (c2 - c1 + 40)*9 : (c2 - c1)*9;

        answer += c2 > c3 ? (c2 - c3) * 9 : (c2 -c3 + 40)*9;
        out.println(answer);
      }
    }
}