class Solution {
    public String reverseWords(String s) {
        String ans="";

        StringBuilder curr= new StringBuilder();

        for(int i=0;i<s.length();i++){
            while(i<s.length()&&s.charAt(i)!=' '){
              curr.append(s.charAt(i));
              i++;

            }
            ans=ans+curr.reverse().toString();
            if(i<s.length() && s.charAt(i)==' ')ans+=" ";
            curr=new StringBuilder();
        }
        return ans;
        
    }
}