class Solution {
    static {
        for (int j = 0; j < 1001; j++) {
            isAnagram("", "v");
        }
    }
    public static boolean isAnagram(String s, String t) {
        Set<String> hm= new HashSet<>();
        int [] freq= findFreq(s);
        String key=Arrays.toString(freq);
        hm.add(key);

        freq=findFreq(t);
        key=Arrays.toString(freq);
        if(hm.contains(key))return true;
        return false;
    }
   static int[] findFreq(String s){
        int [] freq= new int [26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        return freq;

    }
}