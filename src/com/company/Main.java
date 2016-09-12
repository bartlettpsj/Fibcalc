package com.paul;

public class Main {

    public static void main(String[] args) {
        System.out.println("v1");
        fib(0,1);

        System.out.println("v2");
        fib2();
    }

    private static int fib(int prev, int curr)
    {
        int calc = prev + curr;
        System.out.println(curr);

        if (calc < 100)
            fib(curr, calc);

        return calc;
    }

    private static void fib2()
    {
        int curr = 0;
        int prev = 1;

        while (curr < 100) {
            int t = curr;
            curr += prev;
            prev = t;
            System.out.println(curr);
        }

    }
}
