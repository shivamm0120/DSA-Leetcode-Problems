class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans=new StringBuilder();
        char[] ch= num.toCharArray();
        int n=ch.length;

        Deque<Character> stack= new ArrayDeque<>();
        int i=0;

        while(i<n){

            while(k>0 && !stack.isEmpty()&& stack.peek()>ch[i]){
               stack.pop();
                k--;
            }
            stack.push(ch[i]);
            i++;
        }
    
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        while(!stack.isEmpty()){
           ans.insert(0, stack.pop());
        }
        if(ans.length()==0)return "0";
        while(ans.length()>0 && ans.charAt(0)=='0')ans.deleteCharAt(0);
        return ans.length()==0?"0":ans.toString();
        

    }
}