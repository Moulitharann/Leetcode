class Solution {
      public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int res = n;
        while (res != 1 && !seen.contains(res)) {
            seen.add(res);
            res = Check(res);
        }
        return res == 1;
    }
    private static int Check(int num)
    {
        int value=0;
        while(num>0)
        {
            int reamin=num%10;
             value+=(reamin*reamin);
             num/=10;
        }
        return value;
    }
}