class Solution {
    public String getEncryptedString(String s, int k) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int ind=(i+k)%s.length();
            arr[i]=s.charAt(ind);
        }
        return new String(arr);
    }
}