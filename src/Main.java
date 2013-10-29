import java.util.Scanner;
import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author Fayimora Femi-Balogun (fayi@fayimora.com)
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task272 solver = new Task272();
		solver.solve(1, in, out);
		out.close();
	}
}

class Task272 {
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

