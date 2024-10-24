class Solution {
    public int xorOperation(int n, int start) {
        int value=start;
        for(int i=1;i<n;i++)
        {
             value^=start+2*i;
        }
        return value;
    }
}