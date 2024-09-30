class Solution {
    public int minimizedStringLength(String s) {
       ArrayList<Character> ch=new ArrayList<>();
       for(char c:s.toCharArray())
       {
         if(!ch.contains(c))
         {
             ch.add(c);
         }
       }
       return ch.size();
    }
}