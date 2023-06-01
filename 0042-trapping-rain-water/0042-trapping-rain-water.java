class Solution {
    public int trap(int[] height) {
        //trapped water at index is min of either side and the value at the index
        int l[] = new int[height.length];
        int r[] = new int[height.length];
        l[0]=height[0];
        int res=0;
        for(int i=1;i<height.length;i++){
            l[i]=Math.max(l[i-1],height[i]);
        }
        r[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>0;i--){
            r[i]=Math.max(r[i+1],height[i]);
        }
        for(int i=1;i<height.length;i++){
            res=res+Math.min(l[i],r[i])-height[i];
        }
        return res;
        /*int l=0,r=0,res=0;
        //trapped water at index is min of either side and the value at the index
        for(int i=1;i<height.length;i++){
            l=height[i]; r=height[i];
            for(int j=0;j<i;j++){
                l=Math.max(l,height[j]);
            }
            for(int j=i+1;j<height.length;j++){
                r=Math.max(r,height[j]);
            }
            res=res+Math.min(l,r)-height[i];
        }
        return res;*/
    }
}