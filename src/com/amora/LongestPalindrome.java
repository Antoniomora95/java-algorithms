package com.amora;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            String longAt = "";

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (longAt.length() == 0) {
                    longAt = String.valueOf(s.charAt(i));
                } else {
                    longAt = s.charAt(left) + longAt + s.charAt(right);
                }

                left--;
                right++;
                if (longAt.length() > longest.length()) {
                    longest = longAt;
                }
            }

            //reset left right and also the string;
            left = i;
            right = i + 1;
            longAt = "";
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                longAt = s.charAt(left) + longAt + s.charAt(right);
                left--;
                right++;
                if (longAt.length() > longest.length()) {
                    longest = longAt;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        LongestPalindrome palindrome = new LongestPalindrome();
        System.out.println(palindrome.longestPalindrome("cbbd"));
    }
}
