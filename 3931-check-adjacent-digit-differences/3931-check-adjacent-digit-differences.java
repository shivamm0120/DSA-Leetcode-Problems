class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length();
        int prev=s.charAt(0)-'0';int next;
        
        for(int i=0;i<n-1;i++){
            next=s.charAt(i+1)-'0';
            
            
            if(Math.abs(next-prev) >2)return false;
            prev=next;
        }
        return true;
        
    }
}