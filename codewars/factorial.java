public class Factorial {
  public int factorial(int n) {
    if(n < 0 || n > 12) {
      throw new IllegalArgumentException("Argument out of range");
    }
    int result = 1;
    for(int i = 1;  i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
