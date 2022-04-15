public class Main {
  public static void main(String[] args) {
    int result = sum(11);
    int a =0+1+2+3+4+5+6+7+8+9+10+11;
    System.out.println(result);
    System.out.println(a);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}