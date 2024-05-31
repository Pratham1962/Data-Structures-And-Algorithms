Class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // Convert the character to an integer
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);

                //The substring method in Java takes two arguments: the starting index (inclusive) and the ending index (exclusive)
            }
        }
        return "";
    }
}

