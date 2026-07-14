class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int op1 = Integer.valueOf(stack.pop());
                int op2 = Integer.valueOf(stack.pop());

                stack.push(op1 + op2);
            } else if (token.equals("-")) {
                int op1 = Integer.valueOf(stack.pop());
                int op2 = Integer.valueOf(stack.pop());

                stack.push(op2 - op1);
            } else if (token.equals("*")) {
                int op1 = Integer.valueOf(stack.pop());
                int op2 = Integer.valueOf(stack.pop());
            
                stack.push(op1 * op2);
            } else if (token.equals("/")) {
                int op1 = Integer.valueOf(stack.pop());
                int op2 = Integer.valueOf(stack.pop());

                stack.push(op2 / op1);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    
}
