package com.amora;

public class TribonacciNumber {
    int[] fibNumbers = new int[38];

   public TribonacciNumber() {
       fibNumbers[0] = 0;
       fibNumbers[1] = 1;
       fibNumbers[2] = 1;
    }

    public int tribonacci(int n) {
       for(int i = 3; i <= n; i++) {
           var currentNumber = fibNumbers[i - 1] + fibNumbers[i - 2] + fibNumbers[i-3];
           fibNumbers[i] = currentNumber;
       }
       System.out.printf("this is the tribonacci number for %s: %s \n", n, fibNumbers[n]);
       return fibNumbers[n];
    }

    public static void main(String[] args) {
       TribonacciNumber tribonacci = new TribonacciNumber();
       tribonacci.tribonacci(37);
       tribonacci.tribonacci(25);
    }
}
