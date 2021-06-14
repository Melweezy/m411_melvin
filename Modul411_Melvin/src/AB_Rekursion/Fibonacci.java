package AB_Rekursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = in.nextInt();

        double start= System.currentTimeMillis();
//        long nThFibonacciNumber = calculateNthFibonacciNumberRecurisve(n);
        long nThFibonacciNumber = calculateNthFibonacciNumberItterative(n);
        double now = System.currentTimeMillis();

        double elapsedTime = (now-start);
        System.out.println(nThFibonacciNumber + "\nElapsed Time: " + elapsedTime + " ms");
    }

    public static long calculateNthFibonacciNumberItterative(long number){
        int num1 = 0;
        int num2 = 1;
        int fib = 0;

        for (long i = 0; i < number; i++)
        {
            fib = num1 + num2;
            num2 = num1;
            num1 = fib;
        }

        return fib;
    }

    public static long calculateNthFibonacciNumberRecurisve(long n)
    {
        if (n <= 1) return n;
        else return calculateNthFibonacciNumberRecurisve(n - 1) + calculateNthFibonacciNumberRecurisve(n - 2);
    }

}
