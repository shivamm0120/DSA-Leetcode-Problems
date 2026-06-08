class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>al= new ArrayList<>();
       return generate(0,0,n,"",al);
        
    }
     List<String> generate(int open,int close,int n,String s,List<String> al){
        if(open==n && close==n){
            al.add(s);
            return al;
        }
        if(open<n){
            generate(open+1,close,n,s+"(",al);
        }
        if(close<open){
            generate(open,close+1,n,s+")",al);
        }
        return al;

    }
}