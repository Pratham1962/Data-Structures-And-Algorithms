import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and add each element to the HashSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Convert the HashSet back to an array
        int j = 0;
        for (int x : set) {
            nums[j++] = x;
        }

        // Return the size of the HashSet, which is the number of unique elements
        return set.size();
    }
}

