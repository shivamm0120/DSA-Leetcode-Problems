class Solution {
    public int rotatedDigits(int n) {
        int count=0;

        for(int i=1;i<=n;i++){

        String num = Integer.toString (i);
        if(num.contains("3")||num.contains("4")||num.contains("7"))continue;
        if(rotate(num)!=i)count++;

        }
        return count;
        
    }
    static int rotate(String nums){
       nums= nums.replace('2','x');
       nums= nums.replace('5','2');
       nums= nums.replace('x','5');

        nums=nums.replace('6','x');
        nums=nums.replace('9','6');
        nums=nums.replace('x','9');
        return Integer.parseInt(nums);
        
    }
}