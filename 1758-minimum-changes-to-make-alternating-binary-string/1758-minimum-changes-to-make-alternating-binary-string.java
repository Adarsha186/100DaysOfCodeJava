class Solution {
    public int minOperations(String s) {
        String s0="",s1="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                s0+="0";
                s1+="1";
            }
            else{
                s0+="1";
                s1+="0";
            }
        }
        int c0=0,c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s0.charAt(i)){
                c0++;
            }
            if(s.charAt(i)!=s1.charAt(i)){
                c1++;
            }
        }
        return Math.min(c0,c1);
    }
}