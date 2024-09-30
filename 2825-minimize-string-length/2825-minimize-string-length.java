class Solution {
    public int minimizedStringLength(String s) {
        char []ch=s.toCharArray();
        int[] count=new int[26];
        int res=0;
        for(char c:ch)
        {
            count[c-'a']++;
        }
        for(int a:count)
        {
            if(a>0)
            {
                res++;
            }
        }
        return res;
    }
}