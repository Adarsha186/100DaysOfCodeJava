class Solution {
    public int missingNumber(int[] nums) {
        int n1=0,n2=0,n3=nums.length;
        for(int i=0;i<nums.length;i++){
            n1=n1+nums[i];
        }
        while(n3>=0){
            n2=n2+n3;
            n3--;
        }
        return n2-n1;
    }
}