class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ind = {-1, -1};
        int c = 0;
        while(c < nums.length){
            if(target == nums[c]){
                if(ind[0] == -1){
                    ind[0] = c;
                }
                ind[1] = c;
            }
            c += 1;
        }
        return ind;
    }
}
