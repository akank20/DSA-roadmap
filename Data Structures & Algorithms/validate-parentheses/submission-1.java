class Solution {
    public boolean isValid(String s) {
        //Edge cases 
        if (s== null) 
            return false;
        //Odd length string 
        if (s.length() % 2 != 0)
            return false;
        Map<Character, Character> map = Map.of('(',')', '[',']','{','}');
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            
            if (map.containsKey(ch)) {
                //open brackect
                stack.push(ch);
            } else {
                //closing brackect
                if (!stack.isEmpty() && map.get(stack.peek()) == ch) {
                    stack.pop();
                } else {
                    return false;
                }     
            }
        }
        return stack.isEmpty();
    }
}
