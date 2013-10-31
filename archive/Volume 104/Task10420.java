package main;

import java.io.PrintWriter;
import java.util.*;

public class Task10420 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      Map<String, Integer> map = new HashMap<String, Integer>();
      int num = in.nextInt();
      while(num-- >= 1){
        String country = in.next(); in.nextLine();
        int n = map.get(country) == null ? 0 : map.get(country);
        map.put(country, n+1);
      }
      List<String> list = new ArrayList<String>(map.keySet());
      Collections.sort(list);
      for(String s: list)
        out.printf("%s %d\n", s, map.get(s));
    }
}
