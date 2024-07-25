class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for (char i : columnTitle.toCharArray()){
            res=res*26+(i-'A'+1);
        }
        return res;
    }
}