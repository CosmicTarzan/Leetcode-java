class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List quads = new ArrayList(); 
        for(int j = 0; j < nums.length - 3; j++){
            if(j>0 && nums[j] == nums[j-1]){
                continue;
            }
            for(int i = j + 1; i < nums.length - 2; i++){
                if(i > j + 1 && nums[i] == nums[i - 1]){
                    continue;
                }
                int l = i + 1;
                int r = nums.length - 1;
                while(l < r){
                    long sum = (long) nums[j] + nums[i] + nums[l] + nums[r];
                    if(sum < target){
                        l += 1;
                    }
                    else{
                        if(sum > target){
                            r -= 1;
                        }
                        else{
                            int[] quad = {nums[j], nums[i], nums[l], nums[r]};
                            quads.add(quad);
                            while (l < r && nums[l] == quad[2]){
                                l += 1;
                            }
                            while (l < r && nums[r] == quad[3]){
                                r -= 1;
                            }
                        }
                    }
                }
            }
        }
        return quads;
    }
}
