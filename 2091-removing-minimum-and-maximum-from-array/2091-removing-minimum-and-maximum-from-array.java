class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1)return 1;

        int min_index=0,max_index=0;
        int size=nums.length;
        int start=0,end=size-1;

        for(int i=1;i<size;i++){
            if(nums[i]<nums[min_index])
               min_index=i;
            else if(nums[i]>nums[max_index])
               max_index=i;
        }
        int mid=size/2;

        if(min_index<mid && max_index<mid )
           return Math.max(min_index,max_index)+1;

        else if( min_index>=mid && max_index>=mid)
          return size-Math.min(min_index,max_index);
        else if(max_index>min_index){
            int deletion =Math.min(max_index+1 , size-min_index);
            return Math.min(deletion, min_index+1+size-max_index);
        }
        else{
            int deletion=Math.min(min_index+1,size-max_index);
            return Math.min(deletion,max_index+1 + size-min_index);
        }


        // else if(min_index<max_index){
        //     if(max_index-min_index < size-max_index)
        //     return max_index+1;
        //    return min_index+1 + size-max_index;
        // }
        // else {
        //     if(min_index-max_index< max_index+1)
        //      return size-max_index;
        //     return max_index+1 +size- min_index;
        // }
          
    }
}