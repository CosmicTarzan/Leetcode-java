class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList trips = new ArrayList();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0){
                    l += 1;
                }
                else{
                    if(sum > 0){
                        r -= 1;
                    }
                    else{
                        int[] trip = {nums[i], nums[l], nums[r]};
                        trips.add(trip);
                        while (l < r && nums[l] == trip[1]){
                            l += 1;
                        }
                        while (l < r && nums[r] == trip[2]){
                            r -= 1;
                        }
                    }
                }
            }
        }
        return trips;
    }
}
