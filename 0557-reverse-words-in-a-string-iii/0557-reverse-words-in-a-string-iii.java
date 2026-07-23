class Solution {
    public String reverseWords(String s) {
       int n=s.length();
       int start=0,end=0;
       StringBuilder ans= new StringBuilder();

       for( end=0;end<n;end++){
            if(s.charAt(end)==' '){
                String reversed =reverse(s.substring(start,end));
                ans.append(reversed);
                ans.append(' ');
                start=end+1;
            }
       }
       if(start<end){
         String reversed =reverse(s.substring(start,end));
         ans.append(reversed);

       }
      
       return ans.toString();
        
    }
    public String reverse (String s){
        char[]ch= s.toCharArray();
        int left=0;int right=ch.length-1;

        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;right--;

        }
        return new String(ch);
    }
}