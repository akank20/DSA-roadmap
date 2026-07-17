class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int maxHot = 0;
        int[] res = new int[temperatures.length];

        for (int j = temperatures.length - 1; j >= 0; j--) {

            int curr = temperatures[j];
            if (curr >= maxHot) {
                maxHot = curr;
                continue;
            }

            int days = 1;
            while (temperatures[j + days] <= curr) {
                days += res[j + days];
            }
            res[j] = days;

        }
        return res;
    }
}