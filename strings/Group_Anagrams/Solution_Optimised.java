class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();

        for(int i=0;i<strs.length;i++){

            String st=strs[i];

            char[] ch=st.toCharArray();

            Arrays.sort(ch);

            String temp=new String(ch);

            if(!map.containsKey(temp)){
                List<String> val=new ArrayList<>();
                val.add(st);
                map.put(temp,val);
            }

            else{
                map.get(temp).add(st);
            }
        }

        for(List<String> list: map.values()){
            ans.add(list);
        }

        return ans;


    }
}
