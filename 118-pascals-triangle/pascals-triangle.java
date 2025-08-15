class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
       for(int row=1;row<=numRows;row++){
        result.add(nCr(row));
       }
       return result;
    }
    private List<Integer> nCr(int row){
        List<Integer> temp = new ArrayList<>();
        int ans =1;
        temp.add(ans);
        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            temp.add(ans);
        }
        return temp;
        

    }
}