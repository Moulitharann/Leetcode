class Solution {
    public String solve(int a,int b,String s){
        StringBuilder sb=new StringBuilder(s);
        while(a>0&&b>0){
                sb.append('b');
                sb.append('a');
                a--;
                b--;
            }
        return sb.toString();
    }
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb=new StringBuilder();
        int ac=0,bc=0;

        if(a==b)
        return solve(a,b,sb.toString());
        if(a>b){
            while(a>0&&b>0){
                sb.append('a');
                ac++;
                a--;
                if(ac%2==0){
                    sb.append('b');
                    bc++;
                    b--;
                }
                if(a==b){
                   return solve(a,b,sb.toString());
                }
            }
        }
        else {
            while(a>0&&b>0){
                sb.append('b');
                bc++;
                b--;
                if(bc%2==0){
                    sb.append('a');
                    ac++;
                    a--;
                }
                if(a==b){
                   return solve(a,b,sb.toString());
                }
            }
        }

        while(a>0){sb.append('a'); a--;}
        while(b>0){sb.append('b'); b--;}
        return sb.toString();
    }
}