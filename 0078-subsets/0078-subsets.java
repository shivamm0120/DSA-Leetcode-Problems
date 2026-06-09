class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        findSubsets(0,nums,ans,new ArrayList<>());

     return ans;   
    }
    void findSubsets(int index,int []arr,List<List<Integer>> ans,List<Integer> al){
        if(index==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }

        //pick 
        al.add(arr[index]);
        findSubsets(index+1,arr,ans,al);

        al.remove(al.size()-1);
        findSubsets(index+1,arr,ans,al);

    }
}