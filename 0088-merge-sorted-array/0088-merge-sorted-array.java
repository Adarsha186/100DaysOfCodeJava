class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        for(int j=0;j<nums2.length;j++){
            nums1[k]=nums2[j];
            k++;
        }
        Arrays.sort(nums1);
        /*int nums3[] = new int[nums1.length];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(j<n){
            while(j<n){
                nums3[k]=nums2[j];
                k++;
                j++;   
            }
        }
           if(i<m){
            while(i<m){
                nums3[k]=nums1[i];
                k++;
                i++;   
            }
        }
        for(int x=0;x<nums1.length;x++){
            nums1[x]=nums3[x];
        }*/
       } 
}