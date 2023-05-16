class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr_max=0;
        for(int i=0;i<nums.length;i++){
            curr_max=Math.max(0,curr_max);
            curr_max+=nums[i];
            max=Math.max(max,curr_max);
        }
        return max;
    }
}