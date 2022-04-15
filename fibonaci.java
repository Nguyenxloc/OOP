public class Main {
    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);/// fibonacci(n-1)(the number bef )
    }

    public static void main(String args[]) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
        
        for (int i = 0; i < maxNumber; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    // timeline: 
    //f(1)-->return =1
    //f(2)---> return=f(2-2)+ f(0)
}//Fibonacci Series of 10 numbers: 0 1 1 2 3 5 8 13 21 34