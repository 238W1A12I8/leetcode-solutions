class MyStack {
    private Queue<Integer> que1;
    private Queue<Integer> que2;
    public MyStack() {
        que1=new LinkedList<>();
        que2=new LinkedList<>();
    }
    public void push(int x) {
        while(que1.size()>0){
            que2.add(que1.remove());
        }
        que1.add(x);
        while(que2.size()>0){
            que1.add(que2.remove());
        }
    }
    
    public int pop() {
        return que1.remove();
    }
    
    public int top() {
        return que1.peek();
    }
    
    public boolean empty() {
        if(que1.size()==0){
            return true;
        }else{
            return false;
        }
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