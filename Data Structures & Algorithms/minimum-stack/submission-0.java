class MinStack {


    Stack<Integer> numbers;
    PriorityQueue<Integer> mins;
    public MinStack() {

        numbers= new Stack();
        mins = new PriorityQueue();
        
    }
    
    public void push(int val) {
        numbers.push(val);
        mins.add(val);
    }
    
    public void pop() {
        int val = numbers.pop();
        mins.remove(val);
        
    }
    
    public int top() {
        return numbers.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
