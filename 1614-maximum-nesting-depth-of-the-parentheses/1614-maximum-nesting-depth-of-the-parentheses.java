class Solution {
    public int maxDepth(String s) {
        int count=0, maxCount=0;

        for(char a : s.toCharArray()){
            if(a=='(')count++;
            else if(a==')')count--;

            maxCount=Math.max(maxCount,count);

        }
        return maxCount;
    }
}