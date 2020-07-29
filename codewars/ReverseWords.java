import java.util.*;

public class Kata
{
  public static String reverseWords(final String original)
  {
    String[] str = original.split(" ");
    if(str.length == 0) {
      return original;
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0 ; i<str.length; i++) {
      result.append(new StringBuilder(str[i]).reverse( ));
      if(i != str.length -1)
        result.append(" ");
    }
    return result.toString();
  }
}
