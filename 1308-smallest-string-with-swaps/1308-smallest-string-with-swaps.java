class Solution {
    private int[][] aux;
    private int[] array;
    private int[] size;
    
    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        aux = new int[n][];
        array = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = i;
            size[i] = 1;
        }
        char[] str = s.toCharArray();
        
        for(List<Integer> pair : pairs) {
            union(pair.get(0), pair.get(1));
        }
        
        for(int i = 0; i < n; i++) {
            int root = root(i);
            if(aux[root] == null) aux[root] = new int[26];
            aux[root][str[i] - 'a']++;
        }
        
        for(int i = 0; i < n; i++) {
            int root = root(i);
            int index = 0;
            while(aux[root][index] == 0) index++;
            aux[root][index]--;
            str[i] = (char) (index + 'a');
        }
        return new String(str);
    }
    
    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
    private int root(int node) {
        while(node != array[node]) {
            array[node] = array[array[node]]; // Path compression
            node = array[node];
        }
        return node;
    }
    
    private void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        
        if(rootP != rootQ) {
            // Union by rank
            if(size[rootP] > size[rootQ]) {
                array[rootP] = rootQ;
            } else if(size[rootP] < size[rootQ]) {
                array[rootQ] = rootP;
            } else {
                array[rootP] = rootQ;
                size[rootQ]++;
            }
        }
    }
}