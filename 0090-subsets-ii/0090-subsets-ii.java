class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans= new ArrayList<>();
         ans.add(new ArrayList<>());
         findSubsets(0,nums,ans,new ArrayList<>());

     return ans; 
        
    }
    void findSubsets(int index,int []arr,List<List<Integer>> ans,List<Integer> al){
        if(index==arr.length){
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])continue;

            al.add(arr[i]);
            ans.add(new ArrayList<>(al));
            findSubsets(i+1,arr,ans,al);
            al.remove(al.size()-1);
        }
    }

}