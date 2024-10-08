class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        int imbalance=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[')
            {
                st.push(ch);
            }
            else if(ch==']' && st.empty())
            {
                imbalance++;
            }
            else
            {
                st.pop();
            }

        }
        return (imbalance+1)/2;
    }
}