class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            while (!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] curr = stack.pop();
                res[curr[1]] = i - curr[1];
            }
            stack.push(new int[]{temp, i});
        }
        return res;
    }
}
//[30,38,30,36,35,40,28]
//  |
//Stack : []
//Res : [0, 0, 0, 0, 0, 0, 0]

