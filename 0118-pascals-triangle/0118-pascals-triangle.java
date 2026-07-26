class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal= new ArrayList<>();

        List<Integer>row=new ArrayList<>();
        row.add(1);
        pascal.add(row);

        if(numRows==1)return pascal;

        for(int i=1;i<numRows;i++){
            row=new ArrayList<>();
            row.add(1);
            List<Integer>last= pascal.get(i-1);

            for(int j=1;j<last.size();j++){
                row.add(last.get(j-1)+last.get(j));
            }
            row.add(1);

            pascal.add(row);
        }
        return pascal;
    }
}