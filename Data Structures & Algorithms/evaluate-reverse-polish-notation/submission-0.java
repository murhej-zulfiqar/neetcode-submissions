class Solution {
    public int evalRPN(String[] tokens) {
        
        String symbols ="+-*/";
        Stack<Integer> numbers = new Stack();
        for(String token: tokens){
            if(symbols.contains(token)){
                int right = numbers.pop();
                int left = numbers.pop();
                switch(token){
                    case "+":
                        numbers.push(left + right);
                        break;
                    case "-":
                        numbers.push(left - right);
                        break;
                    case "*":
                        numbers.push(left * right);
                        break;
                    case "/":
                        numbers.push(left / right);
                        break;   
                }
            }
            else{
                numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }
}
