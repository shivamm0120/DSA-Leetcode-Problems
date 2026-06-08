class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> al= new ArrayList<>();
        findCombination(0,0,target,candidates,candidates.length,al,ans);
        return ans;
        
    }
   public void findCombination(int i,int sum,int target,int[] arr,int n,List<Integer> al,List<List<Integer>> ans){

        if(i==n){
            if(sum==target)
                ans.add(new ArrayList<>(al));
            return;
        }

        //pick
        if(sum+arr[i]<=target){
            al.add(arr[i]);
            findCombination(i,sum+arr[i],target,arr,n,al,ans);
            al.remove((Integer)arr[i]);//backtrack
        }

        //not pick
        findCombination(i+1,sum,target,arr,n,al,ans);
    }
}