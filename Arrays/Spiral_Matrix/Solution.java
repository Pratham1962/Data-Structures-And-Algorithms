class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        List<Integer> temp = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                temp.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                temp.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    temp.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){ //when it is top=0 bottom=2. When we have only column and  rows.
            for (int i = bottom; i >= top; i--) {
                temp.add(matrix[i][left]);
            }
            left++;

            }
        }
        return temp;
    }
}

