class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int x1=-1,x2=-1;
        if(s1.equals(s2)){return true;}
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(x1==-1){x1=i;}
                else if(x2==-1){x2=i;}
                else{return false;}
            }
        }
        if(x1>=0 && x2>=0){
            if(s1.charAt(x2)==s2.charAt(x1) && s1.charAt(x1)==s2.charAt(x2)){return true;}
        }
        return false;
    }
}