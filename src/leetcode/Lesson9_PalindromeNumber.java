package leetcode;

import java.math.BigInteger;

public class Lesson9_PalindromeNumber {
    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.
    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */
    public static boolean isPalindrome(int x) {
//        CÁCH 1:
//        boolean check = false;
//        String strNumber = Integer.toString(x);
//        StringBuilder reversed = new StringBuilder();
//        for (int i = strNumber.length() - 1; i >= 0; i--) {
//            reversed.append(strNumber.charAt(i));
//        }
//        if (strNumber.equals(reversed.toString())) check = true;
//        return check;
//        CÁCH 2:
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
