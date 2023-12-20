class Solution {
    public int removeElement(int[] nums, int val) {
        int popped = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                popped += 1;
            }
            else{
                nums[i-popped] = nums[i];
            }
        }
        return nums.length - popped;
    }
}
