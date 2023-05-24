class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);//reverse the array
        reverse(nums,0,k-1);//reverse first k elements
        reverse(nums,k,nums.length-1);//reverse remaining elements
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