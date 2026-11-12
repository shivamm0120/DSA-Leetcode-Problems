class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int begin=0;
        int count=0;
        int max=0;

        HashSet<Character>hs=new HashSet<>();

        for(int end=0;end<n;end++){
            char curr=s.charAt(end);

            if(hs.contains(curr)){
                while(s.charAt(begin)!=curr){
                    count--;
                    hs.remove(s.charAt(begin));
                    begin++;
                }
                begin++;
            }
            else{
                count++;
                hs.add(curr);
                if(max<count)max=count;
            }

        }
        return max;
        
    }
}