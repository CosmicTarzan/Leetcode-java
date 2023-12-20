class Solution {
    public int removeDuplicates(int[] nums) {
        int popped = 0;
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i - 1]){
                popped += 1;
            }
            nums[i-popped] = nums[i];
        }
        return nums.length - popped;
    }
}
