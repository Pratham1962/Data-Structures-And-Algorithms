class Solution {

    public static boolean anagrams(String str1, String str2){
       
        if(str1.length()!=str2.length()) return false;

        int[] hash=new int[26];

        for(int i=0;i<str1.length();i++){
            hash[str1.charAt(i)-'a']++;
            hash[str2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(hash[i]!=0) return false;
        }

        return true;

    }

    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> ans=new ArrayList<>();
        int[] arr=new int[strs.length];

        for(int i=0;i<strs.length;i++){
            if(arr[i]==0){
                arr[i]=1;
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);

                for(int j=0;j<strs.length;j++){
                   
                    if(i!=j){
                        if(anagrams(strs[i],strs[j])){
                            arr[j]=1;
                            temp.add(strs[j]);
                        }
                       
                    }
                }

                ans.add(temp);
            }
        }

        return ans;


    }
}
