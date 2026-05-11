class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        while(fast!=1){
            slow=findSquare(slow);
            fast=findSquare(fast);
            fast=findSquare(fast);

            if(fast==slow && slow!=1){
                return false;
            }


        }
        return true;
        
    }
    static int findSquare(int n){
        int sum=0;

        while(n>0){
        int d=n%10;
        n=n/10;
        sum+=d*d;
        }
        return sum;
    }
}