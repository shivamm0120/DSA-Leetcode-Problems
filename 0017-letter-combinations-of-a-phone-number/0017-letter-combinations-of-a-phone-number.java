class Solution {
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();

        List<String>ans= new ArrayList<>();
        findCombination(0,ans,digits,"");

        return ans;
        
    }
   void findCombination(int index,List<String>al,String digits,String current){
        if(index==digits.length()){
            al.add(current);
            return;
        }
        String letters =map[digits.charAt(index)-'0'];
        
        for(int i=0;i<letters.length();i++){
            findCombination(index+1,al,digits,current+letters.charAt(i));

        }
    }
}