class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        if(n==1)return ans;
         findCombination(1,k,n,ans,new ArrayList<>());
         return ans;
        
    }
    void findCombination(int start,int k,int target,List<List<Integer>>ans,List<Integer>curr){
        if(target==0){
            if(curr.size()==k)
            ans.add(new ArrayList<>(curr));
         return; 
        }

        //either target becomes -ve or when no of choices is k but the target is not 0  so we cant get further soln 
        if(target<0 ||curr.size()>=k)return;

        for(int i=start;i<=9;i++) {
            //
            if(i>target) break;

            curr.add(i);
            findCombination(i+1,k,target-i,ans,curr);
            curr.remove(curr.size()-1);
        } 
    }
}