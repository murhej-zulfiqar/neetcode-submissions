class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for(Character c: s.toCharArray()){
            if(c == '(' || c =='[' || c =='{')
                stack.push(c);
            else{
                if(stack.size() == 0){
                    return false;
                }
                char top = stack.peek();
                String pair= top +""+ c;
                if(
                    pair.equals ("()") || 
                    pair.equals ("{}") || 
                    pair.equals ("[]")
                ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        return stack.size() == 0;
        
    }
}
