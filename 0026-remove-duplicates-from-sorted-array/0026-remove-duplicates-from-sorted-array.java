class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=0;
        int curr=nums[0];
        while(i<nums.length){
            if(curr!=nums[i]){
                j++;
                nums[j]=nums[i];
                curr=nums[i];
            }
            i++;
        }
        return j+1;
    }
}