class MinStack {


    Stack<Integer> numbers;
    Stack<Integer> mins;
    public MinStack() {
        numbers= new Stack();
        mins = new Stack();
    }
    
    public void push(int val) {

        numbers.push(val);
        int min = val;
        if(mins.size() > 0){
            min = Math.min(val, mins.peek());
        }
        mins.push(min);
    }
    
    public void pop() {
        numbers.pop();
        mins.pop();
    }
    
    public int top() {
        return numbers.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
