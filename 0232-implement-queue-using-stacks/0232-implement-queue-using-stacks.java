class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int front;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(s1.isEmpty()){
            front=x;
        }
        s1.push(x);
    }
    
    public int pop() {
        int res;
        while(!s1.isEmpty()){
            int x = s1.pop();
            s2.push(x);
        }
        res = s2.pop();
        front = s2.isEmpty()?-1:s2.peek();
        while(!s2.isEmpty()){
            int x = s2.pop();
            s1.push(x);
        }
        return res;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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