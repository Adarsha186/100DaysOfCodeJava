class Solution {
    public int search(int[] nums, int target) {
        int k=0,min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                k=i;
            }
        }
        k = nums.length - k;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        int l=0,r=nums.length-1;
        int m;
        while(l<=r){
            m = (l+r)/2;
            if(nums[m]==target){return (m + nums.length - k)%nums.length;}
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return -1;
    }
    public void reverse(int[] a, int st, int en){
        int temp;
        while(st<en){
            temp = a[st];
            a[st] = a[en];
            a[en] = temp;
            st++;
            en--;
        }
    }
}