class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        char temp[]=word.toCharArray();
        String str="aeiouAEIOU";
        int vowel=0,uppercase=0,lowercase=0,digit=0,consonant=0;
        for(int i=0;i<temp.length;i++){
            if(str.indexOf(temp[i])!=-1){ vowel++; continue;}
            if(Character.isDigit(temp[i])){ digit++; continue;}
            if(Character.isUpperCase(temp[i])) {uppercase++; continue;}
            if(Character.isLowerCase(temp[i])) {lowercase++; continue;}
            consonant++;
        }
        if(vowel>= 1  &&( lowercase>=1 || uppercase>=1) && consonant ==0){
            return true;
        }
        return false;
    }
}