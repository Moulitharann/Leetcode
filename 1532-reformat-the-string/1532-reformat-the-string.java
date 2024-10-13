class Solution {
    public String reformat(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder num = new StringBuilder();
        
        // Separate letters and digits
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num.append(s.charAt(i));
            } else {
                str.append(s.charAt(i));
            }
        }
        
        // If the difference in length is more than 1, it's impossible to reformat
        if (Math.abs(str.length() - num.length()) > 1) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        boolean isLetterTurn = str.length() > num.length();
        
        // Interleave characters and digits
        int i = 0, j = 0;
        while (i < str.length() || j < num.length()) {
            if (isLetterTurn && i < str.length()) {
                result.append(str.charAt(i++));
            } else if (j < num.length()) {
                result.append(num.charAt(j++));
            }
            isLetterTurn = !isLetterTurn;
        }
        
        return result.toString();
    }
}
