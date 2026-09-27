class MinStack {


    static class Node {
        Integer value;
        Integer min;
    }
    Stack<Node> numbers;
    public MinStack() {

        numbers= new Stack();
        
    }
    
    public void push(int val) {
        int min = val;
        
        if(numbers.size() > 0){
            Node n = numbers.peek();
            if(n.min < val){
                min = n.min;
            }
        }
        Node node = new Node();
        node.value = val;
        node.min = min;
        numbers.push(node);


    }
    
    public void pop() {
        numbers.pop();
    }
    
    public int top() {
        return numbers.peek().value;
    }
    
    public int getMin() {
        return numbers.peek().min;
    }
}
