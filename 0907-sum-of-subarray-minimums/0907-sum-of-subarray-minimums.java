class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;long sum=0;
        int mod=(int)1e9 +7;
 
        Stack<Integer> stack= new Stack<>();

        int []left = findPrevSmaller(arr,stack);
        stack.clear();
        int []right = findNextSmaller(arr,stack);
        
        for(int i=0;i<n;i++){
            left[i]=i-left[i];
            right[i]-=i;

            sum=(sum+1L*arr[i]*left[i]*right[i])%mod;

        }
        return (int)sum;
    }
   int[] findPrevSmaller(int []arr,Stack<Integer>stack){
    int []left= new int [arr.length];
    
    for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty()&& arr[stack.peek()]>arr[i])
           stack.pop();

        left[i]=stack.isEmpty()?-1:stack.peek();
        stack.push(i);
    }
    return left;
   }
   int [] findNextSmaller(int []arr,Stack<Integer>stack){
     int []right= new int [arr.length];
     for(int i=arr.length-1;i>=0;i--){
        while(!stack.isEmpty()&& arr[stack.peek()]>=arr[i])
           stack.pop();

        right[i]= stack.isEmpty()?arr.length:stack.peek();
        stack.push(i);
     }
    return right;
   }
}