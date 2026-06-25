// import java.util.Queue;
// import java.util.ArrayDeque;
class MyStack {
     Queue<Integer>queue =new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.offer(x);
        int i=1;
        while(i<=queue.size()-1){
           int ele= queue.poll();
            queue.offer(ele);
            i++;
        }
    }
    
    public int pop() {
       return queue.poll();
        
    }
    
    public int top() {
        
       return queue.peek();
    }
    
    public boolean empty() {
        return queue.size()==0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */