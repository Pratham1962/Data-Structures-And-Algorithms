class Solution {
    
    public static int maxEle(int [][] matrix, int mid, int n, int m){

        int max= -1;
        int index=-1;
        for(int i=0;i<n;i++){
           if(matrix[i][mid]>max){
               max=matrix[i][mid];
               index=i;
           }
        }

        return index;
    }

    public int[] findPeakGrid(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0, high=m-1;
        int[] ans=new int[2];

        ans[0]=ans[1]=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int max=maxEle(matrix, mid, n ,m);
            int left= (mid-1>=0)? matrix[max][mid-1]:-1;
            int right=(mid+1<m)? matrix[max][mid+1]:-1;

            if(left<matrix[max][mid]&& right <matrix[max][mid]){
                ans[0]=max;
                ans[1]=mid;
                return ans;
            }

            else if(left>matrix[max][mid]){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }

        return ans;
    }
}
