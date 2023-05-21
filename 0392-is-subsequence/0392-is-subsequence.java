class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=0;
        if(s.equals("")){return true;}
        for(int i=0;i<t.length();i++){
            if(s.charAt(x)==t.charAt(i)){
                x++;
                if(x==s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}