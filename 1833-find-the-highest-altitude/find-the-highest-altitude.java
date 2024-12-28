class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int sum=0;
        for (int i=0;i<gain.length;i++){
            sum+=gain[i];
            highest=Math.max(highest,sum);
        }
        return highest;
    }
}