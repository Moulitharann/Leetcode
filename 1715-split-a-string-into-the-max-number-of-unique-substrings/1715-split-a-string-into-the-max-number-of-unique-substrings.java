class Solution {
    public int maxUniqueSplit(String s) {
        int maxcount[]=new int[1];
        HashSet<String> unique=new HashSet<>();
        helper(s,0,maxcount,unique);
        return maxcount[0];
    }
    public void helper(String s,int value,int[] maxcount,HashSet<String> unique)
    {
        if(value==s.length())
        {
            if(maxcount[0]<unique.size())
            {
                maxcount[0]=unique.size();
            }
            return;
        }

        StringBuilder sb=new StringBuilder();
         for (int i = value; i < s.length(); ++i) {
            sb.append(s.charAt(i));

            // Check if the current substring is unique
            if (!unique.contains(sb.toString())) {
                unique.add(sb.toString());
                helper(s, i + 1, maxcount, unique);
                unique.remove(sb.toString());
            }
        }
    }
}