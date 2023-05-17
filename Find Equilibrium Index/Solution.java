class Solution {
    public static void main(String[] args) {
        int a[]={-1,2,3,5,-3,6,3,-2};
        int sum=0,fl=0;
        for(int i=0;i<a.length;i++){sum+=a[i];}
        int lsum=0;
        for(int i=0;i<a.length;i++){
            sum-=a[i];
            if(lsum==sum){
                System.out.println("Equilibrium Index : "+i);
                fl=1;
                break;
            }
            lsum+=a[i];
        }
        if(fl==0){System.out.println(-1);}
        
    }
}