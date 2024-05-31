class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int x = (tomatoSlices - (2 * cheeseSlices)) / 2, y = cheeseSlices - x;
        if (x * 4 + y * 2 == tomatoSlices && x >= 0 && y >= 0) return Arrays.asList(x, y);
        else return new ArrayList<>();
    }
}
