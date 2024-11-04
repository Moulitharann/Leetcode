class Solution {
    public String compressedString(String word) {
       int start=0,i=1;
       StringBuilder sb=new StringBuilder();
       while(i<word.length())
       {
         while(i<word.length() && word.charAt(i)==word.charAt(i-1) && (i-start)<10)
         {
            i++;
         }
         if((i-start)==10)
         {
            i--;
         }
          sb.append(i - start);
            sb.append(word.charAt(start));
           start = i;
            i++;
        }
        if (start == word.length() - 1) {
            sb.append(i - start);
            sb.append(word.charAt(start));
        }
        return sb.toString();
    }
}