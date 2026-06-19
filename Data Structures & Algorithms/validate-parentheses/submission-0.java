class Solution {
    public boolean isValid(String s) {
        //Edge cases 
        if (s== null || s.length() < 2 ) 
            return false;
        //Odd length string 
        if (s.length() % 2 != 0)
            return false;
        Map<Character, Character> map = Map.of('(',')', '[',']','{','}');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("Curr str:" + ch);
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
            System.out.println("Stack :" + stack);
        }
        return stack.isEmpty();
    }
}
