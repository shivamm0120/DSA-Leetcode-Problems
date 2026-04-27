class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        int [] freq = new int [n+1];
        ArrayList<Integer> al= new ArrayList<>();

        //initialise freq array 
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }

        //traverse freq array to check whose freq is 0
        for(int i=1;i<n+1;i++){
            if(freq[i]==0)al.add(i);
        }
        return al;
        
    }
}