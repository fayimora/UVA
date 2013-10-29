import java.util.Scanner;
import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
		Task494 solver = new Task494();
		solver.solve(1, in, out);
		out.close();
	}
}

class Task494 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      while(in.hasNextLine()){
        Matcher m = Pattern.compile("[a-zA-Z]+").matcher(in.nextLine());
        int count =0;
        while(m.find()) count++;
        out.println(count);
      }
    }
}

