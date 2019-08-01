/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        boolean isNegative = false;

        if (x < 0) {
            x = 0 - x;
            isNegative = true;
        }

        int reversed = 0;
        int p = x;

        while (p > x) {
            int mod = p % 10;
            p /= 10;
            reversed = reversed * 10 + mod;
        }

        if (isNegative) {
            reversed = 0 - reversed;
        }

        return reversed;
    }
}

