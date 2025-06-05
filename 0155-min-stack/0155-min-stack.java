class MinStack {
    Stack<Integer> demo ;
    Stack<Integer> demo1;

    public MinStack() {
        demo=new Stack<>();
        demo1=new Stack<>();
        
        
    }
    
    public void push(int val) {
        demo.push(val);
        if(demo1.isEmpty() || val<=demo1.peek() ){
            demo1.push(val);
            }
        
    }
    
    public void pop() {
        if(demo.pop().equals(demo1.peek())){
            demo1.pop();

        }
        
    }
    
    public int top() {
        return demo.peek();
        
    }
    
    public int getMin() {
        return demo1.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */