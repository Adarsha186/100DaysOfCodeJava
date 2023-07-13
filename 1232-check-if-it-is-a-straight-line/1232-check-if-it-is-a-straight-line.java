class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2){return true;}
        int ym = coordinates[1][1]-coordinates[0][1];
        int xm = coordinates[1][0]-coordinates[0][0];
        for(int i=2;i<coordinates.length;i++){
            int y=coordinates[i][1];
            int x=coordinates[i][0];
            if(xm*(y-coordinates[0][1])!=ym*(x-coordinates[0][0])){return false;}
        }
        return true;
    }
}