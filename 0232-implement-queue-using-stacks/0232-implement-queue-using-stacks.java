class MyQueue {
    Stack<Integer>stack1= new Stack<>();
    Stack<Integer>stack2= new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
        
    }
    
    public int pop() {
        int top=stack1.size()-1;
        while(top-->0){
            stack2.push(stack1.pop());
        }
       int ele= stack1.pop();
       while(!stack2.isEmpty()){
        stack1.push(stack2.pop());
       }
       return ele;
        
    }
    
    public int peek() {
        int top=stack1.size()-1;
        while(top-->0){
            stack2.push(stack1.pop());
        }
       int ele= stack1.peek();
       while(!stack2.isEmpty())
        stack1.push(stack2.pop());
        return  ele; 
    }
    
    public boolean empty() {
        return stack1.size()==0;
        
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