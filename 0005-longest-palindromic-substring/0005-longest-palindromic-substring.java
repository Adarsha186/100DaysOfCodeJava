class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];
        String ans="",x="";
        for(int diff=0;diff<s.length();diff++){
            for(int i=0,j=i+diff;j<s.length();i++,j++){
                if(diff==0){dp[i][j]=true;}
                else if(diff==1){
                    dp[i][j] = (s.charAt(i)==s.charAt(j));
                }
                else{
                    dp[i][j] = (s.charAt(i)==s.charAt(j)) && dp[i+1][j-1];
                }
                if(dp[i][j]){
                    x = s.substring(i,j+1);
                    if(x.length()>ans.length()){
                        ans = x;
                    }
                }
            }
        }
        return ans;
    }
}