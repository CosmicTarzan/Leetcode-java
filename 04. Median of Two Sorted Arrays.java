class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i: nums1){
            nums.add(i);
        }
        for(int i: nums2){
            nums.add(i);
        }
        Collections.sort(nums);
        if(nums.size() % 2 == 0){
            double a = nums.get((nums.size() / 2 - 1));
            double b = nums.get((nums.size() / 2));
            return((a + b) / 2);
        }
        return nums.get((nums.size() / 2));
    }
}
