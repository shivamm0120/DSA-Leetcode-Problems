class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int a=arr1.length;
        int b=arr2.length;
        int count=0;
        boolean flag=false;

        for(int i=0;i<a;i++){
            int min=arr1[i]-d;
            int max=arr1[i]+d;
            for(int j=0;j<b;j++){
                if(arr2[j]>=min && arr2[j]<=max){
                    flag=true;
                }
            }
            if(!flag)count++;
            flag=false;
        }
        return count;
        
    }
}