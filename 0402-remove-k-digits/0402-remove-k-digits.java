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
           ans.append(stack.pop()); //will take O(n)
                                //before i was using insert method that requires shifting of elements ie :O(n2)
        }
        ans.reverse();//reverse the num

        //removing leading zeroes 
        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0')i++;
        return ans.length()==0 || i>=ans.length()?"0":ans.substring(i);
    }
}