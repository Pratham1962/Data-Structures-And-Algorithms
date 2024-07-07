class Solution {
    public String reverseWords(String s) {
    s = s.trim();
    int n = s.length();
    boolean flag = true;
    StringBuilder ans = new StringBuilder();

    for (int i = n - 1; i >= 0; i--) {
        StringBuilder word = new StringBuilder();

        if (s.charAt(i) == ' ') continue;

        while (i >= 0 && s.charAt(i) != ' ') {
            word.insert(0, s.charAt(i));
            i--;
        }

        if (flag) {
            ans.append(word);
            flag = false;
        } else {
            ans.append(" ").append(word);
        }
    }

    return ans.toString();
}
}
