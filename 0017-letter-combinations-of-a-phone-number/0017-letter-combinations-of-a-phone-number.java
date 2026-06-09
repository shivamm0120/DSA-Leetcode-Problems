class Solution {
    public List<String> letterCombinations(String digits) {
        String[] digit={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String>ans= new ArrayList<>();
        findCombination(0,digit,digits.length(),ans,digits,"");

        return ans;
        
    }
   void findCombination(int index,String []digit,int n,List<String>al,String digits,String comb){
        if(index==n){
            al.add(comb);
            return;
        }
        int num=digits.charAt(index)-'0';
        
        for(int i=0;i<digit[num].length();i++){
            String temp=comb;
            comb+=digit[num].charAt(i);

            findCombination(index+1,digit,n,al,digits,comb);
            comb=temp;

        }
    }
}