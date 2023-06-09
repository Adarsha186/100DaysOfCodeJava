class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            res[0]=i;
            if(map.containsKey(target-nums[i])){
                if(map.get(target-nums[i])!=i){
                    res[1]=map.get(target-nums[i]);
                    return res;
                }
            }
        }
        return res;
    }
}