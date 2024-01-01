class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (numRows <= 0){
            return ans;
        }
        for (int i = 0; i < numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i){
                    row.add(1);
                } else {
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
