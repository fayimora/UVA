package main;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task494 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      while(in.hasNextLine()){
        Matcher m = Pattern.compile("[a-zA-Z]+").matcher(in.nextLine());
        int count =0;
        while(m.find()) count++;
        out.println(count);
      }
    }
}
