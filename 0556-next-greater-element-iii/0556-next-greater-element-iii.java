class Solution {
    public int nextGreaterElement(int n) {
        //convert num into char array
        char[] num= String.valueOf(n).toCharArray();
        
        int i=num.length-2;
        while(i>=0&& num[i]>=num[i+1]){
            i--;
        }

        if(i==-1)return -1;

        //find an element from which it has to be swapped 
        //after swapping elements after ith index will be in decreasing order ..just reverse them
        int j= num.length-1;
        while(j>=0&&num[j]<=num[i]){
            j--;
        }
        swap (num,i,j);
        reverse (num,i+1,num.length-1);
        long num1=Long.parseLong(new String(num));
        if(num1>Integer.MAX_VALUE)return -1;
         return (int)num1;
    }
    void swap (char[] num,int i,int j){
        char temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    void reverse (char[]num,int i,int j){
        while(i<j){
            swap(num,i,j);
            i++;j--;
        }
    }
}