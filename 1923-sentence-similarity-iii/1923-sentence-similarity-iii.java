class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
         String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        if (words1.length < words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }
        int i = 0, j = words1.length - 1;
        int k = 0, l = words2.length - 1;

         while (i <= j && k <= l && words1[i].equals(words2[k])) {
            i++;
            k++;
        }
        
        while (i <= j && k <= l && words1[j].equals(words2[l])) {
            j--;
            l--;
        }
        
       return k > l;
    }
}
