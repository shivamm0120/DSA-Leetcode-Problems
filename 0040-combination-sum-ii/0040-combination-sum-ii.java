class Solution {
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> al= new ArrayList<>();

        findCombination(0,target,candidates,al,ans);
       
        return ans;
        
    }
   public void findCombination(int index,int target,int[] arr,            List<Integer> al,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=index ;i<arr.length;i++){
            if(i>index&& arr[i]==arr[i-1])continue;
            if(arr[i]>target)return;

            al.add(arr[i]);
            findCombination(i+1,target-arr[i],arr,al,ans);
            al.remove(al.size()-1);
        }
    }
}