class Solution {
    public String reverseWords(String s) {
        String ans="";

        StringBuilder curr= new StringBuilder();
        int n=s.length();

        for(int i=0;i<n;i++){
            while(i<n&&s.charAt(i)!=' '){
              curr.append(s.charAt(i));
              i++;

            }
            ans=ans+curr.reverse().toString();
            if(i<n && s.charAt(i)==' ')ans+=" ";
            curr=new StringBuilder();
        }
        return ans;
        
    }
}