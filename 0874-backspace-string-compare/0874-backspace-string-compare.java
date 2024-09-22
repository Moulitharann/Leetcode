class Solution {
    public boolean backspaceCompare(String s, String t) {
       
       return check(s).equals(check(t));
    }
    private static String check(String str)
    {
        StringBuilder s=new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(ch!='#')
            {
                s.append(ch);
            }
            else if(s.length()>0)
            {
                s.deleteCharAt(s.length()-1);
            }
        }
        return s.toString();
    }
}