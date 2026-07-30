class Solution {
    public int minimumPushes(String word) {
        int n =word.length();

    //find how many cycles will be there if i map first char to the first digit,second to the 2nd ,3rd to the 3rd and so on . There is total 8 digits..so after mapping with the 8th digit ..start remapping from the first digit and keep going..
    //here i used formula for sum of 1st n natural no to count no of pushes if there  is some cycles .
        int cycles= n/8;
        int push =cycles*(cycles+1)/2 *8;

//for remaining chars push will be the cycles+1;
        int rem= n%8;
        return push + rem * (cycles+1);
        
    }
}