class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length(),max=0;
        int T[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){T[i][j]=0;}
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){                
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    T[i][j]=1+T[i-1][j-1];
                }
                else{
                    T[i][j]=Math.max(T[i][j-1],T[i-1][j]);
                }
            }
        }
        return T[n][m];
    }
}