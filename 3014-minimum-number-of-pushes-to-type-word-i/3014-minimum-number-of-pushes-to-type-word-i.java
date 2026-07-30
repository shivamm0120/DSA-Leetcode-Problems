class Solution {
    public int minimumPushes(String word) {
        int n =word.length();

        int cycles= n/8;
        int push =cycles*(cycles+1)/2 *8;

        int rem= n%8;
        return push + rem * (cycles+1);
        
    }
}