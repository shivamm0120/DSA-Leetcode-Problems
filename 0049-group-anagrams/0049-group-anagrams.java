class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         Map<String,List<String>> hm= new HashMap<>();

        for(String str:strs){
            char []ch= str.toCharArray();
            int [] freq= new int [26];

            for(char c:ch){
                freq[c-'a']++;
            }
            String s= Arrays.toString(freq);
            hm.putIfAbsent (s,new ArrayList<>());
            hm.get(s).add(str);
        }

        return new ArrayList<>(hm.values());

    }
}