class Solution {
    public int countGoodNumbers(long n) {
        long even=(n%2==0)?n/2:n/2+1;
        long odd= n/2;

        return (int)((pow(5,even)*pow(4,odd))%1000000007);
    }
    static long pow(int x,long n){
        long mod=1000000007;
       if(n==0)return 1;

       long half=pow(x,n/2);
       long ans= (half*half)% mod;

       if(n%2==1)
       ans=(ans*x)% mod;

       return ans;

    }
}