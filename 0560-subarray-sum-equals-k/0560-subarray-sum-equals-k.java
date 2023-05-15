class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int curr_sum=0,ans=0;
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            if(map.containsKey(curr_sum-k)){
                ans=ans+map.get(curr_sum-k);
            }
            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
        }
        return ans;
    }
}