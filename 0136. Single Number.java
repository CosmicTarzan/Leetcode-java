class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(true){
            if(2 * i > nums.length - 2){
                return nums[2 * i];
            }
            if(nums[2 * i] != nums[2 * i + 1]){
                return nums[2 * i];
            }
            i += 1;
        }
    }
}
