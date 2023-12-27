class Solution {
    public int search(int[] nums, int target) {
        int ind = -1;
        int c = 0;
        while(c < nums.length){
            if(target == nums[c]){
                return c;
            }
            c += 1;
        }
        return ind;
    }
}
