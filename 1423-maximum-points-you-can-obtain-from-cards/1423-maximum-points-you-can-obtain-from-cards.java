class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        
        int sum=0;int total=0;
        int minSum=0;

        int left=0;
        int right=0;

        int size=n-k;
        while(right<size){
            sum+=cardPoints[right];
            right++;
        }
        minSum=sum;total=sum;
        while(right<n){
            total+=cardPoints[right];
            
            sum+=cardPoints[right];
            sum-=cardPoints[left];

            minSum=Math.min(minSum,sum);
            right++;
            left++;
        }
        return total-minSum;
    }
}