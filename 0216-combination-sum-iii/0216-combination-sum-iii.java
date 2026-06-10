class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        if(n==1)return ans;
         findCombination(1,k,n,ans,new ArrayList<>());
         return ans;
        
    }
    void findCombination(int start,int k,int n,List<List<Integer>>ans,List<Integer>al){
        if(n==0){
            if(al.size()==k)
            ans.add(new ArrayList<>(al));
         return; 
        }
        if(start>n ||al.size()>=k)return;
        for(int i=start;i<=9;i++) {
            al.add(i);
            findCombination(i+1,k,n-i,ans,al);
            al.remove(al.size()-1);
        } 
    }
}