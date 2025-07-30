class MyQueue {
     ArrayList<Integer> st=new ArrayList<>();;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public int pop() {
        if(!st.isEmpty()) {return st.remove(0);}
        return -1;
        
    }
    
    public int peek() {
        if(!st.isEmpty()){return st.get(0);}
        return -1;
    }
    
    public boolean empty() {
        if(st.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */