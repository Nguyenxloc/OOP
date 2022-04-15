public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);/// biger than lenghth----> program not execute
    } catch (Exception e) {
      System.out.println("Something went wrong.");//// try catch make program keep going and print message while program above error
    }
  }
}
