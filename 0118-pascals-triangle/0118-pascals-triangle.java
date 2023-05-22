class Solution {
    public List<List<Integer>> generate(int numRows) {
        int a1[] = new int[2];
        a1[0]=1;
        a1[1]=1;
        List<List<Integer>> pt = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        pt.add(l1);
        if(numRows==1){return pt;}
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(1);
        pt.add(l2);
        if(numRows==2){return pt;}
        for(int i=2;i<numRows;i++){
            int a[]=new int[i+1];
            a[0]=1;
            a[i]=1;
            for(int x=1;x<a.length-1;x++){
                a[x] = a1[x-1]+a1[x];
            }
            ArrayList<Integer> l3 = new ArrayList<Integer>();
            for(int k=0;k<a.length;k++){l3.add(a[k]);}
            a1=a;
            pt.add(l3);
        }
        return pt;
    }
}