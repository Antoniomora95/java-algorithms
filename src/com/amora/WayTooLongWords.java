package com.amora;

//https://codeforces.com/contest/71/problem/A
public class WayTooLongWords {
    private static String getSimplifiedWord(String word) {
        if (word.length() < 11) {
            return word;
        }
        String str = word.substring(1, word.length() - 1);
        return word.charAt(0) + String.valueOf(str.length()) + word.charAt(word.length() - 1);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int remainingOutput = sc.nextInt();
        while(remainingOutput > 0) {
            String input = sc.next();
            System.out.println(getSimplifiedWord(input));
            remainingOutput--;
        }
    }
}
