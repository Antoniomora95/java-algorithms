package com.amora;
import java.util.*;

//https://codeforces.com/problemset/problem/96/A
public class Football {
//    private static String getIsDangerous(String pl) {
//        char lastSeen = 'a';
//        int equalCount = 0;
//
//        for (int i = 0; i < pl.length(); i++) {
//            char cr = pl.charAt(i);
//            if (cr == lastSeen) {
//                equalCount++;
//            } else {
//               lastSeen = cr;
//               equalCount = 1;
//            }
//            if (equalCount == 7) {
//                return "YES";
//            }
//        }
//        return "NO";
//    }
//    private static void testCases() {
//        List<String> tests = new ArrayList<>();
//        tests.add("001001");
//        tests.add("0000001");
//        tests.add("11111110");
//        tests.add("100000001");
//        tests.add("10000000001");
//        tests.forEach(t -> System.out.printf("%s: %s \n", t, getIsDangerous(t)));
//    }
//    public static void main(String[] args) {
//        //String pl = new Scanner(System.in).next();
//        testCases();
//    }


    private static void getIsDangerous(String pl) {
        char lastSeen = 'a';
        int equalCount = 0;

        for (int i = 0; i < pl.length(); i++) {
            char cr = pl.charAt(i);
            if (cr == lastSeen) {
                equalCount++;
            } else {
                lastSeen = cr;
                equalCount = 1;
            }
            if (equalCount == 7) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        String pl = new Scanner(System.in).next();
        getIsDangerous(pl);
    }
}
