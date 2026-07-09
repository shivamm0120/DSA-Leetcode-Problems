class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans=new StringBuilder();
        Deque<Character> stack= new ArrayDeque<>();
        
        //maintain a monotonic increasing stack such that if current ele is smaller than the top element then do pop 
        for(char digit :num.toCharArray()){

            while(k>0 && !stack.isEmpty()&& digit <stack.peek()){
               stack.pop();
                k--;
            }
            stack.push(digit);
        }
    
    // if there is some more k then pop again 
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        //convert stack into its equivalent no 
        while(!stack.isEmpty()){
           ans.insert(0, stack.pop());
        }
        //removing leading zeroes 
        while(ans.length()>0 && ans.charAt(0)=='0')ans.deleteCharAt(0);
        return ans.length()==0?"0":ans.toString();
        

    }
}