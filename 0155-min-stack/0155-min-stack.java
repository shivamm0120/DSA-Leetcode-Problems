class MinStack {
    Stack <Long>stack = new Stack<>();
  
    long min;

    public MinStack() {
        
    }
    
    public void push(long value) {
        if(stack.isEmpty()){
            stack.push(value);
            min=value;
            return;
        }
        if(value>=min){
            stack.push(value);
        }
        else{//need to modify min value
            stack.push(2*value-min);
            min=value;
        }
    }
    
    public void pop() {
        long ele=stack.pop();
        if(ele<min)
            min=2*min-ele;
    }
    
    public long top() {
        long ele=stack.peek();
        if(ele>=min)return ele;
        return min;
        
    }
    
    public long getMin() {
        return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */