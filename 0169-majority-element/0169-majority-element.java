class Solution {
    public int majorityElement(int[] nums) {
        int m=-1,k=0;
        for(int i=0;i<nums.length;i++){
            if(k==0){
                m=nums[i];
                k=1;
            }
            else if(m==nums[i]){
                k++;
            }
            else{
                k--;
            }
        }
        return m;
        /*HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>nums.length/2){
                return m.getKey();
            }
        }
        return -1;*/
    }
}