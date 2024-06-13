class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;

        while (i < asteroids.length) {
            if (st.isEmpty()) {
                st.push(asteroids[i]);
                i++;
            } else if (asteroids[i] < 0 && st.peek() > 0) {
                if (st.peek() == -asteroids[i]) {
                    st.pop();
                    i++;
                } else if (st.peek() > -asteroids[i]) {
                    i++;
                } else {
                    st.pop();
                }
            } else {
                st.push(asteroids[i]);
                i++;
            }
        }

        int m = st.size();
        int[] ans = new int[m];
        for (int j = m - 1; j >= 0; j--) {
            ans[j] = st.pop();
        }

        return ans;
