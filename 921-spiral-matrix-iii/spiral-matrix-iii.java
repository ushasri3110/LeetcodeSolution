class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res=new int[rows*cols][2];
        int step=1;
        int dir=0;
        int directions[][]=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int idx=0;
        while (idx<rows*cols){
            for (int i=0;i<2;i++){
                for (int j=0;j<step;j++){
                    if (rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                        res[idx][0]=rStart;
                        res[idx][1]=cStart;
                        idx++;
                    }
                    rStart+=directions[dir][0];
                    cStart+=directions[dir][1];
                }
                dir=(dir+1)%4;
            }
            step++;
        }
        return res;
    }
}