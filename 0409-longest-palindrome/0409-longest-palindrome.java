class Solution {
    public int longestPalindrome(String s) {
        int x[] = new int[128];
        for(int i=0;i<s.length();i++){
            x[s.charAt(i)]++;
        }
        int result=0, odd=0;
        for(int i=0;i<x.length;i++){
            if(x[i]%2==0){
                result+=x[i];
            }
            else{
                odd=1;
                result+=x[i]-1;
            }
        }
        return result+odd;
    }
}