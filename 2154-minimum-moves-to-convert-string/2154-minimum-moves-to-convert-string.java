class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int len=s.length();
        int count=0;
        while(i<len)
        {
            if(s.charAt(i)=='X')
            {
                count++;
                i+=3;
            }
            else
            {
                i++;
            }
        }
        return count;
    }
}