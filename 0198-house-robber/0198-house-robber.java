class Solution {
    public int rob(int[] nums) {
        int ch1=0,ch2=0;
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(ch1+nums[i],ch2);
            ch1 = ch2;
            ch2 = temp;
        
        }
        return ch2;
        /*int dp[] = new int[nums.length+1];
        dp[nums.length]=-1;
        return solve(nums,0,dp);*/
    }
    /*static int solve(int[] n, int ind, int[] dp){
        if(ind>n.length || dp[ind]==-1){return 0;}
        int left = n[ind]+solve(n,ind+2,dp);
        int right = solve(n,ind+1,dp);
        return Math.max(left,right);
    }*/
}