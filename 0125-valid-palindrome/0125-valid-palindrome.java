class Solution {
    public boolean isPalindrome(String s) {
        int left=0;int right=s.length()-1;

        char []ch= s.toCharArray();
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(ch[left]))left++;
            while(right>left && !Character.isLetterOrDigit(ch[right]))right--;

            if(Character.isUpperCase(ch[left]))
                ch[left]=Character.toLowerCase(ch[left]);
            if(Character.isUpperCase(ch[right]))
                ch[right]=Character.toLowerCase(ch[right]);

                if(ch[left]!=ch[right])return false;

                left++;
                right--;

        }
        return true;
    }
    
}