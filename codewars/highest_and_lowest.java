
import java.io.*;
import java.util.*;

public class Kata {
  public static String highAndLow(String numbers) {
    String[] res = numbers.split(" ");
    int[] ma = new int[res.length];
    for(int i = 0; i< res.length; i++) {
      ma[i] = Integer.parseInt(res[i]);
    }
    Arrays.sort(ma);
    String result = ma[ma.length - 1]+ " " + ma[0];
    return result;
  }
}
