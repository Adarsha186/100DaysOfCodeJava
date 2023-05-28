class Solution {
    public int[] productExceptSelf(int[] nums) {
        int z=0,pr=1; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){z++;}
            else{pr=pr*nums[i];}
        }
        if(z>=2){return new int[nums.length];}
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=pr;
            }
            else if(nums[i]!=0 && z==1){
                nums[i]=0;
            }
            else{
                nums[i]=pr/nums[i];
            }
        }
        return nums;
    }
}