class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int num = x;
        while (num != 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }
        return reverse == x;
    }
}
