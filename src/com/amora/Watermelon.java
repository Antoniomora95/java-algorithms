package com.amora;
import java.util.*;

//https://codeforces.com/problemset/problem/4/A
public class Watermelon {
    private static void testMethod() {
        List<Integer> testCases = new ArrayList<>();
        testCases.add(10);
        testCases.add(15);
        testCases.add(2);
        testCases.add(1);
        testCases.add(0);
        testCases.add(100);
        testCases.add(50);
        testCases.forEach(value -> {
            System.out.println("what is going on");
            System.out.println(getIsEvenNumber(value) ? "YES" : "NO");
        });

    }
    private static boolean getIsEvenNumber(int value) {
        if (value < 4) {
            return false;
        }
        return (value - 2) % 2 == 0;
    }
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        boolean isEven = getIsEvenNumber(value);
        System.out.print(isEven ? "YES" : "NO");

        testMethod();
    }
}


//public class Css{public static void main(String[]a){System.out.print((new java.util.Scanner(System.in).nextInt()-3)%2<1?"NO":"YES");}}
