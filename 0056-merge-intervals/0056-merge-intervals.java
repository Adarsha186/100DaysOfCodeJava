class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> l = new LinkedList<>();
        l.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(l.getLast()[1]<intervals[i][0]){
                l.add(intervals[i]);
            }
            else{
                l.getLast()[1] = Math.max(l.getLast()[1],intervals[i][1]);
            }
        }
        return l.toArray(new int[l.size()][2]);
    }
}