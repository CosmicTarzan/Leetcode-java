class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList trips = new ArrayList();
        int closest = 99999;
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(closest - target) > Math.abs(sum - target)){
                    closest = sum;
                }
                if(sum < target){
                    l += 1;
                }
                else{
                    if(sum > target){
                        r -= 1;
                    }
                    else{
                        return target;
                    }
                }
            }
        }
        return closest;
    }
}
