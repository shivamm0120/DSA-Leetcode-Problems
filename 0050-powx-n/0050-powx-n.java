class Solution {
    public double myPow(double x, int n) {
        if(n==1)return x;
        return (n>0)?pow(x,n):1/pow(x,n);
    }
    static double pow(double x,int n){
       if(n==0)return 1;

       double half=pow(x,n/2);
       if(n%2==0)return half*half;
       else return half*half*x;

    }
}