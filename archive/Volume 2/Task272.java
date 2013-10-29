package main;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task272 {
  static boolean opened = false;
  public void solve(int testNumber, Scanner in, PrintWriter out) {
    while(in.hasNextLine())
      out.println(parse(in.nextLine()));
  }
  private String parse(String line){
    StringBuilder res = new StringBuilder();
    for (int i=0; i<line.length(); i++){
      if(line.charAt(i) == '"'){
        res.append( opened ? "\'\'" : "``" );
        opened = !opened;
      }else{
        res.append(line.charAt(i));
      }
    }
    return res.toString();
  }
}
