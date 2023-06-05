class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int carry = 0,p=0,q=0;
        int sum=0;
        int x=a.length()-1;
        int y=b.length()-1;
        while(x>=0 || y>=0){
            if(x>=0){
                p = a.charAt(x)-'0';
            }
            if(y>=0){
                q = b.charAt(y)-'0';
            }
            sum=sum+p+q+carry;
            res=res.append(sum%2);
            carry=sum/2;
            p=0;
            q=0;
            sum=0;
            x--;
            y--;
        }
        if(carry!=0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}