//package com.amora;
//
//import java.util.HashSet;
//import java.util.Set;
//
///*
// * https://leetcode.com/problems/minimum-window-substring/
// */
//
//public class MinimumWindowSubstring {
//    class Solution {
//        public String minWindow(String s, String t) {
//            int left = 0;
//            int right = t.length();
//
//            while (right <= s.length()) {
//                String subs = s.substring(left, right);
//                Set<String> set = new HashSet<String>();
//
//            }
//        }
//    }
//
//    // cursor left starts at 0, cursor right starts at t.length
//    // you check if the substring from s resulting from the current left and right cursor
//    // contains all the charaters in t???
//    // if yes
//    // you store those 2 cursor indexes, and maybe the length of that substring, remember that you have to find the smallest possible substring
//    // if not
//    // then you increase by one the right cursor  and the check is performed again
//    // you keep expadng the right side until you find a valid substring
//    //
//}
