class Solution {
    public boolean isCircularSentence(String sentence) {
       String str[]=sentence.split("\\s+");
        String last=str[str.length-1];
        if(str[0].charAt(0) != last.charAt(last.length() - 1))
        {
            return false;
        }
        for(int i=0;i<str.length-1;i++)
        {
            if(str[i].charAt(str[i].length()-1)!=str[i+1].charAt(0))
            {
                return false;
            }
        }
        return true;
    }
}