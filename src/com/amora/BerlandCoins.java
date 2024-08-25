package com.amora;
import java.util.*;

//https://codeforces.com/contest/58/problem/B
public class BerlandCoins {
//    private static void getMoneyDenominations(int inp) {
//        int divider = 1;
//        while(inp > 1) {
//            boolean isValid = inp % divider == 0;
//            if (isValid) {
//                inp = inp / divider;
//                System.out.print(inp + " ");
//            } else {
//                divider++;
//            }
//            if (divider == 1) {
//                divider++;
//            }
//        }
//    }
//    private static void testCases() {
//        List<Integer> tests = new ArrayList<>();
//        tests.add(10);
//        tests.add(4);
//        tests.add(3);
//        tests.add(1000);
//        tests.forEach(BerlandCoins::getMoneyDenominations);
//    }
//    public static void main(String[] args) {
//        int inp = new Scanner(System.in).nextInt();
//        getMoneyDenominations(inp);
//        testCases();
//    }

    private static void getMoneyDenominations(int inp) {
        int divider = 1;
        do {
            boolean isValid = inp % divider == 0;
            if (isValid) {
                inp = inp / divider;
                System.out.print(inp + " ");
            } else {
                divider++;
            }
            if (divider == 1) {
                divider++;
            }
        } while(inp != 1);
    }

    public static void main(String[] args) {
        int inp = new Scanner(System.in).nextInt();
        getMoneyDenominations(inp);
    }
}
