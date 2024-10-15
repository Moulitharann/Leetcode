class Solution {
    public long minimumSteps(String s) {
        int firstzero=0;
        long min=0;
        while(firstzero<s.length() && s.charAt(firstzero)!='1')
        {
            firstzero++;
        }
        for(int i=firstzero+1;i<s.length();++i)
        {
            if(s.charAt(i)=='0')
            {
                min+=i-firstzero;
                firstzero++;
            }
        }
        return min;
    }
}