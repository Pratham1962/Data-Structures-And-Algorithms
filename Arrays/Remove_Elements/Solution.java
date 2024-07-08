
class Solution {
    public int removeElement(int[] arr, int val) {
       
        int n=arr.length;

        int j=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==val){
                j=i;
                break;
            }
        }

        int cnt=j;
        if(j==-1) return n;

        for(int i=j+1;i<n;i++){
            if(arr[i]!=val){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
                cnt++;
            }
        }

        return cnt;

    }
}

