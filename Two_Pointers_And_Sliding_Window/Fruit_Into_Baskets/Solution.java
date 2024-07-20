import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int n = fruits.length;
        int max = 0;

        while (high < n) {
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);
                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }
                low++;
            }

            max = Math.max(max, high - low + 1);
            high++;
        }

        return max;
    }
}
