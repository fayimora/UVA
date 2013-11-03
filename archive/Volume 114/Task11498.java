package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task11498 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      while(in.hasNextLine()){
        int q = in.nextInt();
        if(q==0) break;
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = 0; i < q; i++) {
          int tempX = in.nextInt();
          int tempY = in.nextInt();
          if(x == tempX || y == tempY) // check borders
            out.println("divisa");
          else if(tempX > x && tempY > y) // check NE
            out.println("NE");
          else if(tempX < x && tempY > y) // check NO
            out.println("NO");
          else if(tempX > x && tempY < y ) // check SE
            out.println("SE");
          else
            out.println("SO");
        }
      }
    }
}
