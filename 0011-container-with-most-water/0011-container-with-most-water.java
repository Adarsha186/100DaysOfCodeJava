class Solution {
    public int maxArea(int[] height) {
        int ar=0;
        int l=0, r=height.length-1;
        while(r>l){
            ar = Math.max(ar,(r-l)*Math.min(height[r],height[l]));
            if(height[l]>height[r]){r--;}
            else{l++;}
        }
        return ar;
        /*int ar=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                ar = Math.max(ar,(j-i)*Math.min(height[j],height[i]));
            }
        }
        return ar;*/
    }
}